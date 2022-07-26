package com.realworld.io.util

import androidx.room.TypeConverter
import java.util.*

/**
 * This will convert string to date and date to string
 */
class Converter {
    @TypeConverter
    fun fromDateToString(value : Date) :String{
        return value.time.toString()
    }

    @TypeConverter
    fun fromStringToDate(value : String) :Date{
        return Date(value)
    }
}