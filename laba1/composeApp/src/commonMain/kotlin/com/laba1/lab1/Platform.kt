package com.laba1.lab1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform