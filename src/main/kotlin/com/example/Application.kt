package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import com.google.gson.Gson

val server = DrawingServer()
val gson = Gson()

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSession()
        configureSockets()
        configureRouting()
        configureSerialization()
        configureMonitoring()
    }.start(wait = true)
}
