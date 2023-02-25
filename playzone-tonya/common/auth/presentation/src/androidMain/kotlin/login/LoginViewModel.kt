package login

import com.adeo.kviewmodel.BaseSharedViewModel
import login.models.LoginAction
import login.models.LoginEvent
import login.models.LoginViewState

class LoginViewModel: BaseSharedViewModel<LoginViewState, LoginAction, LoginEvent>(
    initialState = LoginViewState(email = "", password = "")
) {
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