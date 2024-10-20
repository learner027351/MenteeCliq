package com.example.menticliq.Screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.pm.ShortcutInfoCompat
import com.example.menticliq.R


@Composable
fun UpcomingEventsScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF14A2C6)
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            EventHeader()
            SearchBar()
            ScrollableContent()
            BottomNavBar()

        }
    }
}

@Composable
fun EventHeader(){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Events for YOU",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp,
                color = Color.White
            )
            Row {
                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.White

                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_profile),
                        contentDescription = "Profile",
                        tint = Color.White
                    )
                }
                IconButton(onClick = {}) {
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
fun SearchBar(){
    var searchText by remember { mutableStateOf("") }
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp, vertical = 8.dp)
        .background(Color.White)
        .height(28.dp),
        contentAlignment = Alignment.CenterStart
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
        ){
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(8.dp))
            BasicTextField(
                value =searchText,
                onValueChange = {searchText=it},
                modifier = Modifier.fillMaxWidth(),
                decorationBox = {innerTextField->
                    if(searchText.isEmpty()){
                        Text(
                            text = "Search Events",
                            color = Color.Gray
                        )
                    }
                    innerTextField()
                }
            )
        }
    }
}

@Composable
fun ScrollableContent(){
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier

            .verticalScroll(scrollState)
            .background(Color(0xFF14A2C6))
            .padding(16.dp)
    ){
        Text(
            text = "Upcoming Events",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        repeat(6){index->
            Column (modifier = Modifier.fillMaxWidth()){
                Text(
                    text = "Events $index:Online/Offline",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(8.dp))

                Row (
                    modifier = Modifier.fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                ){
                    repeat(6){videoIndex->
                        VideoItem(videoTitle="video $videoIndex")
                        Spacer(modifier = Modifier.width(16.dp))
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

        }
    }
}
@Composable
fun VideoItem(videoTitle:String){

    Box(
        modifier = Modifier
            .size(150.dp,100.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(text = videoTitle)
    }
}

@Composable
fun BottomNavBar(){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(8.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    tint = Color.White
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.History,
                    contentDescription = "History",
                    tint = Color.White
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id=R.drawable.blg),
                    contentDescription = "Blogs",
                    tint = Color.White
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Groups,
                    contentDescription = "Community",
                    tint = Color.White
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.EmojiEvents,
                    contentDescription = "EVents",
                    tint = Color.White
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun UpcomingEventsScreenPreview(){
    UpcomingEventsScreen()
}

