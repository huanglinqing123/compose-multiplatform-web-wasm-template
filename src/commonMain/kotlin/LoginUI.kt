import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

/**
 * @author：HuangLinqing
 * @desc 登陆页面UI
 */
@Composable
fun LoginUI() {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .width(400.dp)
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("userName") },
            placeholder = { Text("input userName") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("password") },
            placeholder = { Text("input password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        )

        Button(onClick = {
            //login
        }) {
            Text("Login")
        }
    }

}
