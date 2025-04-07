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
package com.joelkanyi.focusbloom.core.domain.model

import focusbloom.shared.generated.resources.Res
import focusbloom.shared.generated.resources.other
import focusbloom.shared.generated.resources.personal
import focusbloom.shared.generated.resources.study
import focusbloom.shared.generated.resources.work
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class StateOfN @OptIn(ExperimentalResourceApi::class) constructor(
    val name: String,
    val code: String,
    val capital: String
) {
    override fun toString(): String {
        return "$name - $code"
    }
}

val stateOfNHash = hashMapOf<String, List<String>>()

@OptIn(ExperimentalResourceApi::class)
val listOfStates = listOf(
    StateOfN(
        name = "Lagos",
        code = "LG",
        capital = "Ikeja"
    ),
    StateOfN(
        name = "Oyo",
        code = "OY",
        capital = "Ibadan"
    ),
    StateOfN(
        name = "Ogun",
        code = "OG",
        capital = "Abeokuta"
    ),
    StateOfN(
        name = "Ondo",
        code = "OD",
        capital = "Akure"
    ),
)
