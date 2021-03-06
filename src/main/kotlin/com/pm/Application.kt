package com.pm

import io.ktor.server.application.*
import com.pm.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureAuthentication()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSession()
}