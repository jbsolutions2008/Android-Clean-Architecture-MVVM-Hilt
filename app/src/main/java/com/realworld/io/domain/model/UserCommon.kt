package com.realworld.io.domain.model

data class UserCommon(
    var email: String = "",
    var password: String = "",
    var username: String = "",
    val bio : String ?= "" ,
    val image :String ?= "" ,
    val token : String = ""
)