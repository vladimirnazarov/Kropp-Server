package com.krokkserver

import com.krokkserver.plugins.configureCitiesRouting
import com.krokkserver.plugins.configurePlacesRouting
import com.krokkserver.plugins.configureRouting
import com.krokkserver.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import java.io.File

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)

}

fun Application.module() {

    val jsonCities = File("E:\\Android\\Servers\\cities.json").readText()
    val jsonPlaces = File("E:\\Android\\Servers\\places.json").readText()

    configureRouting()
    configureSerialization()
    configureCitiesRouting(jsonCities)
    configurePlacesRouting(jsonPlaces)
}
