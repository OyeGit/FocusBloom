package com.joelkanyi.focusbloom.feature.location

expect class LocationService {
    suspend fun getLocation(): Location
}