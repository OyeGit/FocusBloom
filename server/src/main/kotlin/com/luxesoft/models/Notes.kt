package com.luxesoft.models

import kotlinx.serialization.Serializable

@Serializable
data class Notes(
    val id:Int,
    val note:String
)
