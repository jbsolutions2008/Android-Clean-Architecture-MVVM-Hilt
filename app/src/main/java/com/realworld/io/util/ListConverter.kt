package com.realworld.io.util

import androidx.room.TypeConverter
import com.google.gson.Gson


/**
 * This will convert string to list and list to string
 */
class ListConverter {
    @TypeConverter
    fun listToJsonString(value: List<String>?): String = Gson().toJson(value)

    @TypeConverter
    fun jsonStringToList(value: String) = Gson().fromJson(value, Array<String>::class.java).toList()
}