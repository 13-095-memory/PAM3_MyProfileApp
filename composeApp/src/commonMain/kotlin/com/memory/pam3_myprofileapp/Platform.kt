package com.memory.pam3_myprofileapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform