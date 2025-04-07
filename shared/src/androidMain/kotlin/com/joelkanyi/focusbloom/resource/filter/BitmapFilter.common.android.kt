package example.imageviewer.filter

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap

@Composable
actual fun getPlatformContext(): PlatformContext {
    TODO("Not yet implemented")
}

actual fun blurFilter(
    bitmap: ImageBitmap,
    context: PlatformContext
): ImageBitmap {
    TODO("Not yet implemented")
}

actual fun pixelFilter(
    bitmap: ImageBitmap,
    context: PlatformContext
): ImageBitmap {
    TODO("Not yet implemented")
}

actual fun grayScaleFilter(
    bitmap: ImageBitmap,
    context: PlatformContext
): ImageBitmap {
    TODO("Not yet implemented")
}

actual class PlatformContext