package com.xotab413.reddit

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.kts.reddit.R
import timber.log.Timber


class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Timber.d("onCreate is called")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onPause() {
        Timber.d("onPause is called")
        super.onPause()
    }

    override fun onDestroy() {
        Timber.d("onDestroy is called")
        super.onDestroy()
    }

    override fun onStart() {
        Timber.d("onStart is called")
        super.onStart()
    }

    override fun onResume() {
        Timber.d("onResume is called")
        super.onResume()
    }

    override fun onStop() {
        Timber.d("onStop is called")
        super.onStop()
    }

    override fun onBackPressed() {
        Timber.d("onBack is called")
        super.onBackPressed()
    }
}