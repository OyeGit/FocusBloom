package com.joelkanyi.focusbloom

import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.coroutines.CoroutineDispatcher

actual class PlatformStorableImage

actual fun createUUID(): String {
    TODO("Not yet implemented")
}

actual val ioDispatcher: CoroutineDispatcher
    get() = TODO("Not yet implemented")
actual val isShareFeatureSupported: Boolean
    get() = TODO("Not yet implemented")
actual val shareIcon: ImageVector
    get() = TODO("Not yet implemented")