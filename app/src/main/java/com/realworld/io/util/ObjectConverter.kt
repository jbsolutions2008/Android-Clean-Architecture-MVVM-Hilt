package com.realworld.io.util

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.realworld.io.domain.model.ArticleX
import com.realworld.io.domain.model.Author

/**
 * This will convert json to list and list to json
 */
class ObjectConverter {

    @TypeConverter
    fun listToJsonString(value: Author?): String = Gson().toJson(value)

    @TypeConverter
    fun jsonStringToList(value: String) = Gson().fromJson(value, Author::class.java)
}