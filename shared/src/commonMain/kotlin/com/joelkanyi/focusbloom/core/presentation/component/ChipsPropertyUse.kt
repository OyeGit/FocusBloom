package com.joelkanyi.focusbloom.core.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)
@Composable
fun ChipsPropertyUse(
    modifier: Modifier = Modifier,
    selectedOption: () -> Unit,
    onOptionSelected: (String) -> Unit,
    textStyle: TextStyle = MaterialTheme.typography.titleSmall,
) {
    Column(
        modifier = Modifier
            .padding(1.dp)

            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        androidx.compose.material3.Text(
            text = "Property Use:",
            color = Color.Black,
            textAlign = TextAlign.Start
        )

        FlowRow(
            modifier = Modifier
                .padding(1.dp)
                .wrapContentHeight(align = Alignment.Top)
        ) {
            Chip(
                onClick = {
                    println("Chip Clicked...!")
                },
                border = ChipDefaults.outlinedBorder,
                colors = ChipDefaults.outlinedChipColors(
                    disabledLeadingIconContentColor = Color.LightGray,
                    disabledContentColor = Color.LightGray,
                    contentColor = Color(0xffFFFFFF),
                    backgroundColor = Color(0xffADD8E6),
                    disabledBackgroundColor = Color(0xffCFD8DC),
                    leadingIconContentColor = Color(0xffFFFFFF)
                ),
                leadingIcon = {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "Localized description"
                    )
                }) {
                androidx.compose.material3.Text("Residential")
            }

            Chip(
                onClick = {
                    println("Chip Clicked...!")
                },
                border = ChipDefaults.outlinedBorder,
                colors = ChipDefaults.outlinedChipColors(
                    disabledLeadingIconContentColor = Color.LightGray,
                    disabledContentColor = Color.LightGray,
                    contentColor = Color(0xffFFFFFF),
                    backgroundColor = Color(0xffFFFFFF),
                    disabledBackgroundColor = Color(0xffCFD8DC),
                    leadingIconContentColor = Color(0xffFFFFFF)
                ),
                leadingIcon = {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "Localized description"
                    )
                }) {
                androidx.compose.material3.Text("Commercial")
            }

            Chip(
                onClick = {
                    println("Chip Clicked...!")
                },
                border = ChipDefaults.outlinedBorder,
                colors = ChipDefaults.outlinedChipColors(
                    disabledLeadingIconContentColor = Color.LightGray,
                    disabledContentColor = Color.LightGray,
                    contentColor = Color(0xffFFFFFF),
                    backgroundColor = Color(0xffFFFFFF),
                    disabledBackgroundColor = Color(0xffCFD8DC),
                    leadingIconContentColor = Color(0xffFFFFFF)
                ),
                leadingIcon = {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "Localized description"
                    )
                }) {
                androidx.compose.material3.Text("Agric")
            }

          /*  Chip(
                onClick = {
                    println("Chip Clicked...!")
                },
                border = ChipDefaults.outlinedBorder,
                colors = ChipDefaults.outlinedChipColors(
                    disabledLeadingIconContentColor = Color.LightGray,
                    disabledContentColor = Color.LightGray,
                    contentColor = Color(0xffFFFFFF),
                    backgroundColor = Color(0xffADD8E6),
                    disabledBackgroundColor = Color(0xffCFD8DC),
                    leadingIconContentColor = Color(0xffFFFFFF)
                ),
                leadingIcon = {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "Localized description"
                    )
                }) {
                androidx.compose.material3.Text("Industrial")
            }*/
        }
    }
}