package com.joelkanyi.focusbloom.client

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.URLProtocol
import io.ktor.http.path

class PropertyPostsApiImpl (
    private val client: HttpClient // helps to make http request and handle responses
) : PropertyPostsApi {
    override suspend fun getPosts(): List<Property> {
        return client.get {
            url {
                protocol = URLProtocol.HTTPS
                host = "luxesoft.luxelist.org"
                path("/posts")
            }
        }.body()
    }
}
