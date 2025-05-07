package com.joelkanyi.focusbloom.core.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import focusbloom.shared.generated.resources.Res
import focusbloom.shared.generated.resources.il_empty
import org.jetbrains.compose.resources.painterResource

@Composable
fun ImageFromUrl() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
      /*  Image(
            modifier = Modifier.size(300.dp)
                .clip(RoundedCornerShape(size = 12.dp)),
            imageModel = {
                "https://www.kotlinguide.com/wp-content/uploads/2024/12/demo_image.png"
            },
            imageOptions = ImageOptions(
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center
            ),
            loading = {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(28.dp)
                    )
                }
            },
            failure = {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(Res.drawable.il_empty),
                        contentDescription = "404 Image Not Found",
                        contentScale = ContentScale.FillBounds

                    )
                }
            }
        )*/
    }
}