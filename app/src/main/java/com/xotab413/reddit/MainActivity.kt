package com.xotab413.reddit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kts.reddit.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        main_button.setOnClickListener {
//            Toast.makeText(this, "Hello, i'm funny toast",Toast.LENGTH_LONG).show()
//        }
    }
}