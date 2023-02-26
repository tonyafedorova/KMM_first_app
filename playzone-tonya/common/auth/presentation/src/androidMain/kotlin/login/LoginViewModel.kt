package login

import AuthRepository
import com.adeo.kviewmodel.BaseSharedViewModel
import login.models.LoginAction
import login.models.LoginEvent
import login.models.LoginViewState
import di.Inject
import kotlinx.coroutines.launch

class LoginViewModel: BaseSharedViewModel<LoginViewState, LoginAction, LoginEvent>(
    initialState = LoginViewState(email = "", password = "")
) {

    private val authRepository: AuthRepository = Inject.instance()

    override fun obtainEvent(viewEvent: LoginEvent) {
        when (viewEvent) {
            is LoginEvent.LoginClick -> sendLogin()
            is LoginEvent.EmailChanged -> obtainEmailChanged(viewEvent.value)
            is LoginEvent.PasswordChanged -> obtainPasswordChanged(viewEvent.value)
            is LoginEvent.ForgotClicked -> openForgot()
            is LoginEvent.RegistrationClicked -> openRegistration()
        }
    }

    private fun sendLogin() {
        viewState = viewState.copy(isSending = true)

        viewModelScope.launch {
            try {
                val response = authRepository.login(viewState.email, viewState.password)
                if (response.token.isNotBlank()) {
                    viewState = viewState.copy(email = "", password = "", isSending = false)
                } else {
                    viewState = viewState.copy(isSending = false)
                }
            } catch(e: Exception) {
                viewState = viewState.copy(isSending = false)
            }
        }
    }

    private fun openForgot() {
        viewAction = LoginAction.OpenForgotPasswordScreen
    }

    private fun openRegistration() {
        viewAction = LoginAction.OpenRegistrationScreen
    }

    private fun obtainEmailChanged(value: String) {
        viewState = viewState.copy(
            email = value
        )
    }

    private fun obtainPasswordChanged(value: String) {
        viewState = viewState.copy(
            password = value
        )
    }
}