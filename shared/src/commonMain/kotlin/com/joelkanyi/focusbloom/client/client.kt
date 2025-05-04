package com.joelkanyi.focusbloom.client

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.*
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json


class Client {

    private val client = HttpClient()

    suspend fun loginInstance( email: String, password: String ): User? {
        val response = client.get("http://37.148.204.80:8080/byLogin/"+email)
        println( "AAB - "+response.bodyAsText()   )
        val user = convertJsonToObject( response.bodyAsText()  )
        return user
    }

    suspend fun createClientInstance1(): String {
        val url = "http://37.148.204.80:8080/byLogin/testedpropertyuse003@gmail.com"
        val response = client.get("http://37.148.204.80:8080/byLogin/testedpropertyuse003@gmail.com")
        val tmp = "\"" +"user" +"\""

        val jsonString = response.bodyAsText()
        println( "AAB - jsonString  = "+jsonString )
        println( "AAB - "+url    )
        val user = convertJsonToObject( jsonString )
        println( "AAB - user?.surName = "+user?.surname  )
        println( "AAB - user?.firstName = "+user?.firstname  )
        println( "AAB - user?.statusId = "+user?.statusid  )
        println( "AAB - +user?.userTypeId = "+user?.usertypeid )
        return response.bodyAsText()
    }

    private fun convertJsonToObject(jsonString: String): User ? {
        return try {
            Json.decodeFromString<User>(jsonString)
        } catch (e: Exception) {
            // Handle parsing errors, e.g., invalid JSON format
            println("Error decoding JSON: ${e.message}")
            null
        }
    }
}