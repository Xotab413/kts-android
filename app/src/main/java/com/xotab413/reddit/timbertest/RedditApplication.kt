package com.xotab413.reddit.timbertest

import android.app.Application
import com.kts.reddit.BuildConfig
import timber.log.Timber

class RedditApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}