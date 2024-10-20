package com.example.menticliq

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.menticliq.Screens.BlogScreenApp
import com.example.menticliq.Screens.Studentform
import com.example.menticliq.Screens.UpcomingEventsScreen
import com.example.menticliq.Screens.rfa
import com.example.menticliq.ui.theme.MentiCliqTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MentiCliqTheme {
                rfa()
                Studentform()
                BlogScreenApp()
                UpcomingEventsScreen()
            }
        }
    }
}

