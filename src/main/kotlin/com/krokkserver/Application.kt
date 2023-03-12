package com.krokkserver

import com.google.gson.Gson
import com.krokkserver.objects.City
import com.krokkserver.objects.Place
import com.krokkserver.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import java.io.File

fun main() {
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
//        .start(wait = true)

    val jsonCities = File("E:\\Android\\Servers\\cities.json").readText()
    val jsonPlaces = File("E:\\Android\\Servers\\places.json").readText()
    val cities = Gson().fromJson(jsonCities, Array<City>::class.java)
    val places = Gson().fromJson(jsonPlaces, Array<Place>::class.java)
    for (i in cities) println(i)
    for (i in places) println(i)
}

fun Application.module() {
    configureRouting()
    configureSerialization()
    configurePlacesRouting()
}
