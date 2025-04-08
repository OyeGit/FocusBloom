import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.joelkanyi.focusbloom.Dependencies
import com.joelkanyi.focusbloom.ImageStorage
import com.joelkanyi.focusbloom.ImageViewerCommon
import com.joelkanyi.focusbloom.ioDispatcher



import com.joelkanyi.focusbloom.view.Toast
import com.joelkanyi.focusbloom.view.ToastState
import example.imageviewer.style.ImageViewerTheme
import kotlinx.coroutines.CoroutineScope

@Composable
internal fun ImageViewerWeb() {
    val toastState = remember { mutableStateOf<ToastState>(ToastState.Hidden) }
    val ioScope: CoroutineScope = rememberCoroutineScope { ioDispatcher }
    //val dependencies = remember(ioScope) { getDependencies(toastState) }

    ImageViewerTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            /*ImageViewerCommon(
                dependencies = dependencies
            )*/
            Surface(modifier = Modifier.fillMaxSize()) {
                Text(text = "Welcome to my Project")
            }
            Toast(toastState)
        }
    }
}


/*
fun getDependencies(toastState: MutableState<ToastState>) = object : Dependencies() {
    //override val imageStorage: ImageStorage = WebImageStorage()
    //override val sharePicture = WebSharePicture()
    //override val notification = WebPopupNotification(toastState, localization)
}
*/


