package com.pm.di

import com.pm.data.repository.UserDataSourceImpl
import com.pm.domain.repository.UserDataSource
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val koinModule = module {
    single {
        KMongo.createClient(System.getenv("MONGODB_URI"))
            .coroutine
            .getDatabase("user_database")
    }

    single<UserDataSource> {
        UserDataSourceImpl(get())
    }
}