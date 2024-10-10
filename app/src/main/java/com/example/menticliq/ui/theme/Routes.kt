package com.example.menticliq.ui.theme

sealed class Routes (val route:String){
    object Home:Routes("Scren1")
    object Profile:Routes("Scren2")
    object Settings:Routes("Scren3")
}