package com.joelkanyi.focusbloom.android.location

import com.joelkanyi.focusbloom.feature.location.Location

class LocationService {
    private val fusedLocationClient by lazy {
        // Initialize FusedLocationProviderClient
    }
    suspend fun getLocation(): Location {
        // Implement logic to get location
        return TODO("Provide the return value")
    }
}