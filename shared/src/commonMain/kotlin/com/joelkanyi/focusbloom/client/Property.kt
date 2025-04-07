package com.joelkanyi.focusbloom.client

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Property (

    val idProp: Int = 0,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val lGA:String,
    val city:String,
    val stateofN: String,
    val title: String,       //   Title
    val description: String,
    val propType: String,    // * Rental, Sale, Lease
    val propUse: String,     // * Residential, Commercial, Agriculture, Industry
    val propSubtype: String, // * Apartment, Flat, House, Shop, Commercial, Farm
    val bedroom: Int,
    val toilets: Int,
    val parking: Int,
    val price: Double,
    val type: Int,
    val enteredDate: LocalDateTime,
    val expiryDate: LocalDateTime,
    val enteredUser: Int,
    val marketedBy: Int,
    val marketedByPhone: String,
    val marketedByEmail: String,
    val status: Int,
    val active: Boolean,
    val img0: String,
    val img1: String,
    val img2: String,
    val img3: String,
    val img4: String,
    val img5: String,
    val img6: String,
    val img7: String,
    val img8: String,
    val img9: String,
    val video1: String,
    val video2: String,
    val marketedByImage: String,

)

