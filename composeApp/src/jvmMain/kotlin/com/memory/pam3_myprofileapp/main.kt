package com.memory.pam3_myprofileapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "PAM3_MyProfileApp",
    ) {
        App()
    }
}