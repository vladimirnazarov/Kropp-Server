package com.krokkserver.objects

data class Place(

    val id: Int,

    val id_point: Int,

    val name: String,

    val text: String,

    val sound: String,

    val lang: Int,

    val last_edit_time: Long,

    val creation_date: String,

    val lat: Double,

    val lng: Double,

    val logo: String,

    val photo: String,

    val city_id: Int,

    val visible: Boolean,

    val images: List<String>,

    val tags: List<Int>,

    val is_excursion: Boolean
)
