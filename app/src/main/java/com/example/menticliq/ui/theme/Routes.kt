package com.example.menticliq.ui.theme

sealed class Routes (val route:String){
    object Login:Routes("Login")
    object FeedBackScreen1:Routes("FeedBackScreen1")
    object FeedBackSCreen2:Routes("FeedBackSCreen2")
    object Home:Routes("Home")
    object History:Routes("History")
    object Blog:Routes("Blog")
    object  Community:Routes("Community")
    object  UE:Routes("UE")
    object SignUp:Routes("SignUp")

}