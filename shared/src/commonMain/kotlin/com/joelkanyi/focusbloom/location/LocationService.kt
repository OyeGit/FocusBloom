package com.joelkanyi.focusbloom.location

expect class LocationService {
    suspend fun getLocation(): Location
}