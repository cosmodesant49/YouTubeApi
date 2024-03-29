package com.geeks.youtubeapi

import android.app.Application
import com.geeks.youtubeapi.di.youtubeModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(youtubeModule)
        }
    }

}