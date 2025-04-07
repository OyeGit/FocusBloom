package com.joelkanyi.focusbloom.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.*

class client {

    val client = HttpClient(CIO)
}