package com.joelkanyi.focusbloom.client
interface PropertyPostsApi {
    suspend fun getPosts(): List<Property> // GET
}