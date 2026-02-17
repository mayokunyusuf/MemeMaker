package com.tombat.mememaker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform