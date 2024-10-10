package com.example.menticliq.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun Home(navController: NavHostController) {
    var counter by remember {
        mutableStateOf(0)
    }
    Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White), contentAlignment = Alignment.Center
    ){
        Text(text = "Home,Counter is $counter",color=Color.Black)

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {counter++}) {
            Text(text = "Increment Counter",color=Color.White)
        }

        Spacer(modifier = Modifier.height(20.dp))
        

    }
}