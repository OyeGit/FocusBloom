package com.joelkanyi.focusbloom.identity

class UserProfile (
    val userNum: Int,
    val userName: String,
    val processID: Long,
    val status: Boolean
)

expect fun getUserProfile(): UserProfile

expect fun setUserProfile( userProfile: UserProfile )

expect fun randomUUID(): String