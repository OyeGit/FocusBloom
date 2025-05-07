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
package com.joelkanyi.focusbloom.core.data.repository.settings

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.toLowerCase
import com.joelkanyi.focusbloom.AppLogger
import com.joelkanyi.focusbloom.client.User
import com.joelkanyi.focusbloom.core.data.local.setting.PreferenceManager
import com.joelkanyi.focusbloom.core.domain.repository.settings.SettingsRepository
import com.joelkanyi.focusbloom.core.utils.convertJsonToObject
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.post
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpHeaders
import io.ktor.http.encodedPath
import kotlinx.coroutines.flow.Flow
import kotlinx.serialization.json.Json

private val tag = SettingsRepositoryImpl::class.qualifiedName.toString()

class SettingsRepositoryImpl(
    private val preferenceManager: PreferenceManager,
) : SettingsRepository {

    override suspend fun saveAppTheme(theme: Int) {
        preferenceManager.setInt(key = PreferenceManager.APP_THEME, value = theme)
    }

    override fun getAppTheme(): Flow<Int?> {
        return preferenceManager.getInt(key = PreferenceManager.APP_THEME)
    }

    override fun clearAll() {
        return preferenceManager.clearPreferences()
    }

    override fun getSessionTime(): Flow<Int?> {
        return preferenceManager.getInt(key = PreferenceManager.FOCUS_TIME)
    }

    override fun getShortBreakTime(): Flow<Int?> {
        return preferenceManager.getInt(key = PreferenceManager.SHORT_BREAK_TIME)
    }

    override fun getLongBreakTime(): Flow<Int?> {
        return preferenceManager.getInt(key = PreferenceManager.LONG_BREAK_TIME)
    }

    override fun getHourFormat(): Flow<Int?> {
        return preferenceManager.getInt(key = PreferenceManager.HOUR_FORMAT)
    }

    override fun saveSessionTime(sessionTime: Int) {
        preferenceManager.setInt(key = PreferenceManager.FOCUS_TIME, value = sessionTime)
    }

    override fun saveLongBreakTime(longBreakTime: Int) {
        preferenceManager.setInt(key = PreferenceManager.LONG_BREAK_TIME, value = longBreakTime)
    }

    override fun saveHourFormat(timeFormat: Int) {
        preferenceManager.setInt(key = PreferenceManager.HOUR_FORMAT, value = timeFormat)
    }

    override fun saveShortBreakTime(shortBreakTime: Int) {
        preferenceManager.setInt(key = PreferenceManager.SHORT_BREAK_TIME, value = shortBreakTime)
    }

    override fun shortBreakColor(): Flow<Long?> {
        return preferenceManager.getLong(key = PreferenceManager.SHORT_BREAK_COLOR)
    }

    override fun saveShortBreakColor(color: Long) {
        preferenceManager.setLong(key = PreferenceManager.SHORT_BREAK_COLOR, value = color)
    }

    override fun longBreakColor(): Flow<Long?> {
        return preferenceManager.getLong(key = PreferenceManager.LONG_BREAK_COLOR)
    }

    override fun saveLongBreakColor(color: Long) {
        preferenceManager.setLong(key = PreferenceManager.LONG_BREAK_COLOR, value = color)
    }

    override fun focusColor(): Flow<Long?> {
        return preferenceManager.getLong(key = PreferenceManager.FOCUS_COLOR)
    }

    override fun saveFocusColor(color: Long) {
        preferenceManager.setLong(key = PreferenceManager.FOCUS_COLOR, value = color)
    }

    override fun saveUsername(value: String) {
        preferenceManager.setString(key = PreferenceManager.USERNAME, value = value)
    }

    override fun saveFirstname(value: String)  {
        preferenceManager.setString(key = PreferenceManager.FIRSTNAME, value = value)
    }

    override suspend fun loginUsernamePassword(email: String, password: String): User? {

        val client = HttpClient()
        val response = client.get("http://37.148.204.80:8080/byLogin/"+ email.lowercase())
        println( "AAB - "+response.bodyAsText()   )
        client.close()
        return convertJsonToObject( response.bodyAsText() )
    }

    override suspend fun registerUsernamePassword(email: String, password: String,
                                                  firstname: String, surname:String,
                                                  telephone: String):User?  {
        println( "AAB - SettingsRepositoryImpl.registerUsernamePassword()" )
   /*     val user = User( 0, firstname, surname, email,"NewUser", 1, 1,
            "image", telephone, password )*/

        val client = HttpClient()

        val response = client.post("http://37.148.204.80:8080/users/register/") {
            parameter("_id", "0" )
            parameter("_firstname", firstname )
            parameter("_surname", surname )
            parameter("_emailaddress", email )
            parameter("_description", "New User" )
            parameter("_statusid", 1 )
            parameter("_usertypeid", 1 )
            parameter("_userimage", "image" )
            parameter("_telephone", telephone )
            parameter("_password", password )
        }
        println( "AAB - "+response.bodyAsText()   )
        client.close()
        return convertJsonToObject( response.bodyAsText() )
    }

    override fun saveUsernamePassword(username: String, password: String) {
        preferenceManager.setString(key = PreferenceManager.USERNAME, value = username)
        AppLogger.i( tag, "saveUsernamePassword() - username = "+username )
    }



    override fun getUsername(): Flow<String?> {
        return preferenceManager.getString(key = PreferenceManager.USERNAME)
    }

    override fun getFirstname(): Flow<String?> {
        return preferenceManager.getString(key = PreferenceManager.FIRSTNAME)
    }

    override fun remindersOn(): Flow<Int?> {
        return preferenceManager.getInt(key = PreferenceManager.NOTIFICATION_OPTION)
    }

    override fun toggleReminder(value: Int) {
        preferenceManager.setInt(key = PreferenceManager.NOTIFICATION_OPTION, value = value)
    }

    data class loggedInUser (
        val user: User
    )
}
