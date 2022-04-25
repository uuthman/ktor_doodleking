package com.example.plugins

import com.example.route.createRoomRoute
import com.example.route.getRoomsRoute
import com.example.route.joinRoomRoute
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    install(Routing){
        createRoomRoute()
        getRoomsRoute()
        joinRoomRoute()
    }
}
