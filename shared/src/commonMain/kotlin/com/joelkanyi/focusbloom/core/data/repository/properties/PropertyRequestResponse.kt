package com.joelkanyi.focusbloom.core.data.repository.properties

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.joelkanyi.focusbloom.core.domain.model.Property
import com.joelkanyi.focusbloom.resource.PictureData
import com.joelkanyi.focusbloom.resource.resourcePictures
import kotlinx.coroutines.delay
import kotlinx.datetime.LocalDateTime

class PropertyRequestResponse (queryParams: HashMap<String, Any?> ) {

    val queryParams = hashMapOf<String, Any?>()

    var propertyList: List<Property> = listOf<Property>()

    val pictures: SnapshotStateList<PictureData> = mutableStateListOf(*resourcePictures)

    fun getProperties() : List<Property> {

        //val pictures: SnapshotStateList<PictureData> = mutableStateListOf(*resourcePictures)

        val prop1 =
            Property(
                1, "20 main street", 6.5244, 3.3792,
                "Ikeja", "Alausa", "Lagos", "One bedroom apartment for rent",
                "Can be used for residential or office use, very spacious and accormodating",
                "Rental", "Residential", "Apartment", 3, 2,
                2, 26000000, 2,
                LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
                LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
                2, 3, "09828761234", "local@mail.com",
                3, 1, "", "", "", "", "", "", "",
                "", "", "", "", "", ""
            )


        val prop2 =  Property( 2, "10 james avenue", 6.244, 3.1792,
                "Ikeja", "Opebi", "Lagos", "One bedroom apartment for rent",
                "Can be used for residential or commercial",
                "Rental", "Residential","Apartment", 3, 2,
                2, 18000000, 2,
                LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
                LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
                2, 3, "09828761234", "local@mail.com",
                3, 1, "", "", "", "", "", "", "",
                "","","","","", "" )

        val prop3 =  Property( 3, "10 james avenue", 6.244, 3.1792,
            "Ikeja", "Opebi", "Lagos", "One bedroom apartment for rent",
            "Can be used for residential or commercial",
            "Rental", "Residential","Apartment", 3, 2,
            2, 16000000, 2,
            LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
            LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
            2, 3, "09828761234", "local@mail.com",
            3, 1, "", "", "", "", "", "", "",
            "","","","","", "" )

        val prop4 =  Property( 4, "10 james avenue", 6.244, 3.1792,
            "Ikeja", "Opebi", "Lagos", "One bedroom apartment for rent",
            "Can be used for residential or commercial",
            "Rental", "Residential","Apartment", 3, 2,
            2, 12000000, 2,
            LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
            LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
            2, 3, "09828761234", "local@mail.com",
            3, 1, "", "", "", "", "", "", "",
            "","","","","", "" )

        val prop5 =  Property( 5, "10 james avenue", 6.244, 3.1792,
            "Ikeja", "Opebi", "Lagos", "One bedroom apartment for rent",
            "Can be used for residential or commercial",
            "Rental", "Residential","Apartment", 3, 2,
            2, 16000000, 2,
            LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
            LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
            2, 3, "09828761234", "local@mail.com",
            3, 1, "", "", "", "", "", "", "",
            "","","","","", "" )

        val prop6 =  Property( 6, "10 james avenue", 6.244, 3.1792,
            "Ikeja", "Opebi", "Lagos", "One bedroom apartment for rent",
            "Can be used for residential or commercial",
            "Rental", "Residential","Apartment", 3, 2,
            2, 12000000, 2,
            LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
            LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
            2, 3, "09828761234", "local@mail.com",
            3, 1, "", "", "", "", "", "", "",
            "","","","","", "" )

        return listOf(prop1, prop1, prop3, prop4, prop5,prop6)

    }

    fun getProperty( i: Int) :  List<Property> {

        //val pictures: SnapshotStateList<PictureData> = mutableStateListOf(*resourcePictures)
        if (i == 1) {
            val prop1 =
                Property(
                    1, "20 main street", 6.5244, 3.3792,
                    "Ikeja", "Alausa", "Lagos", "One bedroom apartment for rent",
                    "Can be used for residential or office use, very spacious and accormodating",
                    "Rental", "Residential", "Apartment", 3, 2,
                    2, 26000000, 2,
                    LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
                    LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
                    2, 3, "09828761234", "local@mail.com",
                    3, 1, "", "", "", "", "", "", "",
                    "", "", "", "", "", ""
                )
            return listOf(prop1 )
        } else if (i == 2) {
            val prop2 = Property(
                2, "10 james avenue", 6.244, 3.1792,
                "Ikeja", "Opebi", "Lagos", "One bedroom apartment for rent",
                "Can be used for residential or commercial",
                "Rental", "Residential", "Apartment", 3, 2,
                2, 18000000, 2,
                LocalDateTime(2024, 3, 1, 9, 15, 0, 0),
                LocalDateTime(2025, 3, 1, 9, 15, 0, 0),
                2, 3, "09828761234", "local@mail.com",
                3, 1, "", "", "", "", "", "", "",
                "", "", "", "", "", ""
            )
            return listOf(prop2 )
        } else {
            return listOf( )
        }




    }
}

