package com.example.menticliq.Screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PostAdd
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.menticliq.R
import kotlin.coroutines.coroutineContext


@Composable
fun BlogScreenApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEBFAFE)
    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            BlogHeader()
            BlogList()
            navigationBar()
        }
    }
}
@Composable
fun BlogHeader(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(26.dp),
        contentAlignment = Alignment.Center
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Blogs for you",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White
            )
            Row {
                IconButton(
                    onClick ={

                }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.White
                    )
                }
                IconButton(onClick = {

                }) {
                    Icon(
                        painter = painterResource(id=R.drawable.ic_profile),
                        contentDescription = "Profile",
                        tint = Color.White
                    )
                }
                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Default.QuestionMark,
                        contentDescription = "Help",
                        tint = Color.White
                    )
                }
            }
        }
    }
}
@Composable
fun BlogList(){
    val scrollState= rememberScrollState()
    Column (
        modifier = Modifier
            .background(Color(0xFF14A2C6))
            .verticalScroll(scrollState).padding(16.dp),
    ){
        repeat(10){index->
            BlogItem(
                authorName="Mentor $index",
                blogtitle = "Topic Of Discussion",
                blogContent = "This is the content of Blog $index"
            )
            Spacer(modifier = Modifier.height(16.dp))

        }
    }
}
@Composable
fun BlogItem(authorName:String,blogtitle:String,blogContent:String){
    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Start
    ){
        Image(
            painter = painterResource(id= R.drawable.ic_profile),
            contentDescription = "Author profile image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(48.dp)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = authorName, fontWeight = FontWeight.Bold,fontSize = 16.sp)
            Text(text = blogtitle, fontWeight =FontWeight.SemiBold,fontSize = 14.sp)
            Text(text = blogContent, fontSize = 12.sp)
        }
    }
}

@Composable
fun navigationBar(){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(8.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    tint = Color.White
                )
            }
           IconButton(
               onClick = {}
           ) {
               Icon(
                   imageVector = Icons.Default.History,
                   contentDescription = "History",
                   tint=Color.White
               )
           }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.blg),
                    contentDescription = "Blogs",
                    tint=Color.White
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Groups,
                    contentDescription = "Groups",
                    tint = Color.White
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.EmojiEvents,
                    contentDescription = "Events",
                    tint = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BlogScreenAppPreview(){
    BlogScreenApp()
}