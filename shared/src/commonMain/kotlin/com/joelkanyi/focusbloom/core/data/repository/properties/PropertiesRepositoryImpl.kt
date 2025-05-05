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
package com.joelkanyi.focusbloom.core.data.repository.properties

import androidx.compose.runtime.LaunchedEffect
import app.cash.sqldelight.coroutines.asFlow
import com.joelkanyi.focusbloom.core.data.mapper.toTask
import com.joelkanyi.focusbloom.core.data.mapper.toTaskEntity
import com.joelkanyi.focusbloom.core.data.utils.mapToList
import com.joelkanyi.focusbloom.core.data.utils.mapToOneOrNull
import com.joelkanyi.focusbloom.core.domain.model.Property
import com.joelkanyi.focusbloom.core.domain.model.Task
import com.joelkanyi.focusbloom.core.domain.repository.properties.PropertiesRepository
import com.joelkanyi.focusbloom.core.domain.repository.tasks.TasksRepository
import com.joelkanyi.focusbloom.database.BloomDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.StateFlow

class PropertiesRepositoryImpl(
    bloomDatabase: BloomDatabase,
) : PropertiesRepository {
    //private val dbQuery = bloomDatabase.taskQueries
    override fun getProperties(queryParams: HashMap<String, Any?> ): Flow<List<Property>> {

        //val queryParam =hashMapOf<String, Any?>()
        val propReqResp = PropertyRequestResponse(queryParams)
        return  listOf( propReqResp.getProperties() ).asFlow()
    }

   /* override fun getProperty(id: Int): Flow<List<Property>> {

        val queryParam =hashMapOf<String, Any?>()
        queryParam["idProp"] = id

        val propReqResp = PropertyRequestResponse(queryParam)
        return listOf( propReqResp.getProperty(id) ).asFlow()
    }*/

}
