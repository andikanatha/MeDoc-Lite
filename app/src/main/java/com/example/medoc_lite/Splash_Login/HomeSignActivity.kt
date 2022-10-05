package com.example.medoc_lite.Splash_Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medoc_lite.R

class HomeSignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_sign)

        supportActionBar?.hide()
    }
}