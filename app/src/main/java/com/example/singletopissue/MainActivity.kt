package com.example.singletopissue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button?.setOnClickListener {
            startActivityForResult(Intent(this, SingleTopActivity::class.java), 11)
        }

        button?.postDelayed({
            button.performClick()
            button?.postDelayed( {
                button.performClick()
            }, 100)
        }, 1000)
    }
}
