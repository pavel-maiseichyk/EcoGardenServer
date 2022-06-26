package com.pm.plugins

import com.pm.domain.model.UserSession
import io.ktor.server.application.*
import io.ktor.server.sessions.*
import java.io.File

fun Application.configureSession() {
    install(Sessions) {
        cookie<UserSession>(
            name = "USER_SESSION",
            storage = directorySessionStorage(File(".sessions"))
        ) {
//            cookie.secure = true
        }
    }
}