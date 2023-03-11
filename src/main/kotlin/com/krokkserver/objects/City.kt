package com.krokkserver.objects

import kotlinx.serialization.Serializable

@Serializable
data class City(

    val id_locale: Int,

    val id: Int,

    val name: String,

    val lang: Int,

    val logo: String,

    val last_edit_time: Long,

    val visible: Boolean,

    val city_is_regional: Boolean,

    val region: String
)
