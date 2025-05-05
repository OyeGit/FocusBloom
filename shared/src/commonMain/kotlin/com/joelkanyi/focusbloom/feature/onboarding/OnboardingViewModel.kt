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
package com.joelkanyi.focusbloom.feature.onboarding

import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joelkanyi.focusbloom.client.User
import com.joelkanyi.focusbloom.core.domain.repository.settings.SettingsRepository
import com.joelkanyi.focusbloom.core.utils.UiEvents
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class OnboardingViewModel(
    private val settingsRepository: SettingsRepository,
) : ViewModel() {
    private val _eventsFlow = Channel<UiEvents>(Channel.UNLIMITED)
    val eventsFlow = _eventsFlow.receiveAsFlow()
    private val _loginState = MutableStateFlow(LoginState())
    val loginState: StateFlow<LoginState> = _loginState.asStateFlow()

    private val _username = MutableStateFlow("")
    private val _password = MutableStateFlow("")
    private val _firstname = MutableStateFlow("")
    private val _surname = MutableStateFlow("")
    private val _telephone = MutableStateFlow("")

    val username = _username.asStateFlow()
    val password = _password.asStateFlow()
    val firstname = _firstname.asStateFlow()
    val surname = _surname.asStateFlow()
    val telephone = _telephone.asStateFlow()

    fun setUsername(username: String) {
        _username.value = username
    }

    fun setFirstname(firstname: String ) {
        _firstname.value = firstname
    }

    fun setSurname(surname: String) {
        _surname.value = surname
    }

    fun setTelephone(telephone: String) {
        _telephone.value = telephone
    }

    fun setPassword(password: String) {
        _password.value = password
    }

    fun saveUsernamePassword( ) {
        viewModelScope.launch {
            val user = settingsRepository.loginUsernamePassword(username.value, password.value)
            println("AAB - Entered username = " + username.value)
            println("AAB - Entered password = " + password.value)
            println("AAB - Server password = " + user?.password)

            if (user != null) {
                println("AAB - USER IS NOT NULL ")
                val serverPassword = user.password.trim()
                val enteredPassword = password.value.trim()
                val firstname = user.firstname

                if (enteredPassword.equals(serverPassword)) {
                    setFirstname(firstname)
                    println("AAB - password matches ")
                    _loginState.update { currentState ->
                        currentState.copy(
                            authenticated = true,
                            usertypeId = user.usertypeid,
                            statusId = user.statusid,
                            userid = user.id
                        )
                    }
                    saveUsername()
                }
            }
            else {
                println("AAB - user is null ")
                _loginState.update { currentState ->
                    currentState.copy(
                        authenticated = false,
                    )
                }
            }
        }
    }

    fun registerUsernamePassword( ) {
        viewModelScope.launch {
             println("AAB - Entered username = " + username.value)
            println("AAB - Entered password = " + password.value)
            println("AAB - Entered firstname = " + firstname.value)
            println("AAB - Entered surname = " + surname.value)
            println("AAB - Entered telephone = " + telephone.value)

            val user = settingsRepository.registerUsernamePassword(username.value,
                password.value, firstname.value, surname.value, telephone.value )

            if (user != null) {
                println("AAB - USER IS NOT NULL ")
                val serverPassword = user.password.trim()
                val enteredPassword = password.value.trim()
                val firstname = user.firstname

                if (enteredPassword.equals(serverPassword)) {
                    setFirstname(firstname)
                    println("AAB - password matches ")
                    //saveUsername()
                    _loginState.update { currentState ->
                        currentState.copy(
                            authenticated = true,
                            usertypeId = user.usertypeid,
                            statusId = user.statusid,
                            userid = user.id
                        )
                    }
                    saveUsername()
                }
            }
            else {
                println("AAB - user is null ")
                _loginState.update { currentState ->
                    currentState.copy(
                        authenticated = false,
                    )
                }
            }
        }
    }

    fun saveUsername() {
        viewModelScope.launch {
            settingsRepository.saveUsername(username.value.trim())
            settingsRepository.saveFirstname(firstname.value.trim())
            settingsRepository.toggleReminder(1)
            _eventsFlow.send(UiEvents.Navigation)
        }
    }

    val typeWriterTextParts = listOf(
        "be focused",
        "be present",
        "concentrate",
        "be effective",
        "be productive",
        "get things done",
        "be efficient",
        "be organized",
        "be intentional",
        "be disciplined",
        "be motivated",
        "be consistent",
        "be mindful",
    )
}

data class LoginState (
    val authenticated : Boolean = false,
    val usertypeId: Int = 0,
    val statusId: Int = 0,
    val userid: Int = 0,
    val error: String = ""
)