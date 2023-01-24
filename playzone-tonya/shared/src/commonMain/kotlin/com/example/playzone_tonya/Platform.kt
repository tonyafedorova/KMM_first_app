package com.example.playzone_tonya

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform