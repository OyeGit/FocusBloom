package com.joelkanyi.focusbloom.location

actual class LocationService {
    actual suspend fun getLocation(): Location {
        TODO("Not yet implemented")
    }
    private val fusedLocationClient by lazy {
        // Initialize FusedLocationProviderClient
    }
}