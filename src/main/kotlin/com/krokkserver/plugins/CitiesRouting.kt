package com.krokkserver.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureCitiesRouting(text: String){
    routing {
        get ("/get_cities/11/"){
            call.respondText(text)
        }
    }
}