package com.joelkanyi.focusbloom.client

import kotlinx.serialization.Serializable

@Serializable
data class User(

    val id: Int,
    val firstname: String,
    val surname: String,
    val emailaddress: String,
    val description: String,
    val statusid: Int,
    val usertypeid: Int,
    val userimage: String,
    val telephone: String,
    val password: String

)
