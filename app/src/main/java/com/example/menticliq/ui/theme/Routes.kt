package com.example.menticliq.ui.theme

sealed class Routes (val route:String){
    object Home:Routes("Home")
    object Profile:Routes("Profile")
    object Settings:Routes("Settings")
}