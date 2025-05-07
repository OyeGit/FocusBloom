/*
 * Copyright 2023 Joel Kanyi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.joelkanyi.focusbloom.core.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter
import coil3.compose.LocalPlatformContext
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.joelkanyi.focusbloom.core.domain.model.Lagos
import com.joelkanyi.focusbloom.core.domain.model.Task
import com.joelkanyi.focusbloom.core.utils.prettyFormat
import com.joelkanyi.focusbloom.core.utils.rememberCustomImagePainter
import com.joelkanyi.focusbloom.resource.PictureData
import com.joelkanyi.focusbloom.resource.resourcePictures
import focusbloom.shared.generated.resources.Res
import focusbloom.shared.generated.resources.ic_complete
import focusbloom.shared.generated.resources.il_empty
import focusbloom.shared.generated.resources.work
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun PropertyCard(
    property: Lagos,
    onClick: (task: Task) -> Unit,
    pictures: SnapshotStateList<PictureData>,
    type: String,
) {

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {
            // onClick(task)
        },
    ) {
        val v_pictures: SnapshotStateList<PictureData> = mutableStateListOf(*resourcePictures)
       // pictures: SnapshotStateList<PictureData>
        println( "AAA - pictures"+ v_pictures.size )
        Row() {
            Column(modifier = Modifier
                .size(140.dp) ) {
                /*
                             AsyncImage(
                             model = ImageRequest.Builder(  )
                                 .data("https://example.com/image.jpg")
                                 .crossfade(true)
                                 .build(),
                             placeholder = painterResource(Res.drawable.il_empty),
                             contentDescription = "image",
                             contentScale = ContentScale.Crop,
                             modifier = Modifier.clip(CircleShape)
                             )
                             */

                         /*   AsyncImage(
                                model = ImageRequest.Builder(LocalPlatformContext.current)
                                    .data("http://37.148.204.80:8080/static/images/7/image2.jpeg.jpg")
                                    //.data("https://delasign.com/delasignBlack.png")
                                    .crossfade(true)
                                    .build(),
                                //model = "http://37.148.204.80:8080/static/images/7/image1.jpeg.jpg", // replace with working URL
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                placeholder = painterResource(Res.drawable.il_empty),
                                onSuccess = {
                                    println ("Image loaded successfully")
                                },
                                onError = {
                                    println ("Error loading image"+it )
                                }
                            )
*/

                Image(
                    painter = rememberCustomImagePainter(
                        "http://37.148.204.80:8080/static/images/7/image2.jpeg.jpg"
                    ),
                    null, modifier = Modifier.fillMaxSize()
                )

                         /*Image(
                             modifier = Modifier
                                 .size(140.dp)
                                 .align(CenterHorizontally),
                             painter = painterResource(  Res.drawable.il_empty ) ,
                             contentDescription = null,
                         )
                        */

            }

            Column(
                modifier = Modifier
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {


                    Column(
                        modifier = Modifier
                            .fillMaxWidth(.85f),
                        verticalArrangement = Arrangement.spacedBy(4.dp),
                    ) {
                        Text(
                            text = property.title,
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                            ),
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )

                        Text(
                            text = property.description,
                            style = MaterialTheme.typography.bodyMedium,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                        )

                    }
                    Icon(
                        modifier = Modifier
                            .clickable {
                                // onShowTaskOption(task)
                            },
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "Task Options",
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        fontWeight = FontWeight.SemiBold,
                                        fontSize = 18.sp,
                                    ),
                                ) {
                                    append("${property.cityid}")
                                }
                                append("/${property.lgaid}")
                            },
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "${
                                property.bedroom

                            } minutes",
                            style = MaterialTheme.typography.bodySmall,
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        if (type == "overdue") {
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = property.entereddate,
                                style = MaterialTheme.typography.bodySmall.copy(
                                    fontWeight = FontWeight.SemiBold,
                                ),
                            )
                        }
                    }
                    if (false) {
                        Image(
                            modifier = Modifier
                                .size(48.dp),
                            painter = painterResource(
                                Res.drawable.work
                            ),
                            contentDescription = "Task Options",
                        )
                    } else {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.primary),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = Icons.Filled.PlayArrow,
                                contentDescription = "Task Options",
                                tint = MaterialTheme.colorScheme.onPrimary,
                            )
                        }
                    }
                }
            }
        }
    }
}
