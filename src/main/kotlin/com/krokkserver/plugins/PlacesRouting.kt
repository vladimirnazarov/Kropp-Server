package com.krokkserver.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configurePlacesRouting(){
    routing {
        get ("/places") {
            call.respondText ("places")
        }
    }
}