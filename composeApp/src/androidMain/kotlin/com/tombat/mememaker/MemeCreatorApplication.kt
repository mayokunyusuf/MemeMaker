package com.tombat.mememaker

import android.app.Application
import com.tombat.mememaker.core.di.appModule
import com.tombat.mememaker.core.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MemeCreatorApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@MemeCreatorApplication)
            modules(appModule)
        }
    }
}