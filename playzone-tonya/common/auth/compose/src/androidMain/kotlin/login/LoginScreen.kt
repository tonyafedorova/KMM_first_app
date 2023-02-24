package login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import theme.Theme

@Composable

fun LoginScreen() {
    Column(modifier = Modifier.padding(30.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Login Now", color = Theme.colors.thirdTextColor,
            fontSize = 24.sp, fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.padding(top = 15.dp),
            text = "Welcome back to PlayZone! Enter your email address and your password to enjoy the latest features of PlayZone",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Theme.colors.hintTextColor
        )
    }
}