package com.example.playzone_tonya.android

import android.os.Bundle
import androidx.activity.ComponentActivity

import navigation.setupThemedNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setupThemedNavigation()
    }
}

