package com.example.bluewavelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)


        val mainLogin= findViewById<Button>(R.id.main_login)
        mainLogin.setOnClickListener {
            startActivity(Intent(this, login::class.java))
        }
        val main_signup= findViewById<Button>(R.id.main_signup)
        main_signup.setOnClickListener {
            startActivity(Intent(this, register::class.java))
        }

    }

}