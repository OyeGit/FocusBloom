package com.joelkanyi.focusbloom.core.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import coil3.ImageLoader
import coil3.compose.rememberAsyncImagePainter
import focusbloom.shared.generated.resources.Res
import focusbloom.shared.generated.resources.il_empty
import focusbloom.shared.generated.resources.redo
import focusbloom.shared.generated.resources.work
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun rememberCustomImagePainter(
    model: Any?,
    imageLoader: ImageLoader,
    contentScale: ContentScale = ContentScale.Fit,
) = rememberAsyncImagePainter(
    model, imageLoader,
    error = painterResource(Res.drawable.redo),
    placeholder = painterResource(Res.drawable.il_empty),
    contentScale = contentScale
)

@Composable
fun rememberCustomImagePainter(
    model: Any?,
    contentScale: ContentScale = ContentScale.Fit,
) = rememberAsyncImagePainter(
    model,
    //error = painterResource(Res.drawable.redo),
    //placeholder = painterResource(Res.drawable.il_empty),
    contentScale = contentScale,
)