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
package com.joelkanyi.focusbloom.core.domain.repository.properties

import com.joelkanyi.focusbloom.core.domain.model.Property
import com.joelkanyi.focusbloom.core.domain.model.Task
import com.joelkanyi.focusbloom.core.utils.convertJsonToObject
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.coroutines.flow.Flow

class PropertiesRepositoryImpl :  PropertiesRepository {

    override fun getProperties(queryParams: HashMap<String, Any?>): Flow<List<Property>>? {
        println( "AAB - PropertiesRepositoryImpl.getProperties()"   )

        val client = HttpClient()
        //val response = client.get("http://37.148.204.80:8080/lagos")
       // println( "AAB - "+response.bodyAsText()   )
        client.close()
        return null
    }

/*    fun getProperty(id: Int):  Flow<List<Property>> {

    }*/

    /*
suspend fun addTask(task: Task)
suspend fun updateTask(task: Task)


suspend fun deleteTask(id: Int)
suspend fun deleteAllTasks()
suspend fun updateConsumedFocusTime(id: Int, focusTime: Long)
suspend fun updateConsumedShortBreakTime(id: Int, shortBreakTime: Long)
suspend fun updateConsumedLongBreakTime(id: Int, longBreakTime: Long)
suspend fun updateTaskInProgress(id: Int, inProgressTask: Boolean)
suspend fun updateTaskCompleted(id: Int, completed: Boolean)
suspend fun updateCurrentSessionName(id: Int, current: String)
suspend fun updateTaskCycleNumber(id: Int, cycle: Int)
fun getActiveTask(): Flow<Task?>
suspend fun updateTaskActive(id: Int, active: Boolean)

suspend fun updateAllTasksActiveStatusToInactive()

 */
}



