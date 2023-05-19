import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow


/**
 * 显示一个登陆页面，代码与Android Compose完全共用
 * @author HuangLinqing
 */
@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow {
        //在这里可以调用任意Compose代码
        LoginUI()
    }
}
