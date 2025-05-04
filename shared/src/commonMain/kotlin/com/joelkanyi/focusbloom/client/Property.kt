package com.joelkanyi.focusbloom.client

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Property (

    val idProp: Int = 0,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val lGA:Int,
    val city:Int,
    val stateofN: Int,
    val title: String,    //   Title
    val description: String,
    val propType: Int,    // * Rental, Sale, Lease
    val propUse: Int,     // * Residential, Commercial, Agriculture, Industry
    val propSubtype: Int, // * Apartment, Flat, House, Shop, Commercial, Farm
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
    val marketedByImage: String,
    val status: Int,
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


)

