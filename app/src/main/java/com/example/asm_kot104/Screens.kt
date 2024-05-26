package com.example.asm_kot104

sealed class Screens(val screen: String) {
    data object Home: Screens("Home")
    data object Bookmark: Screens("MyCart")
    data object Notification: Screens("Notification")
    data object Profile: Screens("Profile")

}