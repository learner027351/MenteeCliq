package com.example.menties.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.menties.R

@Composable
fun SignupScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight()
                .verticalScroll(
                    rememberScrollState()
                ), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val nameState = remember {
                mutableStateOf("")
            }
            val emailState = remember {
                mutableStateOf("")
            }
            val phoneState = remember {
                mutableStateOf("")
            }
            val psswdState = remember {
                mutableStateOf("")
            }
            Image(
                painter = painterResource(id = R.drawable.conversation_102339),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(8.dp)
            )
            Text(
                text = "Sign Up", fontSize = 30.sp, fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp)
            )

            OutlinedTextField(
                value = nameState.value, onValueChange = {
                    nameState.value = it
                },
                label = { Text(text = "Name") },
                modifier = Modifier.padding(8.dp)
            )
            OutlinedTextField(
                value = emailState.value, onValueChange = {
                    emailState.value = it
                },
                label = { Text(text = "Email") },
                modifier = Modifier.padding(8.dp)
            )
            OutlinedTextField(
                value = phoneState.value, onValueChange = {
                    phoneState.value = it
                },
                label = { Text(text = "Phone") },
                modifier = Modifier.padding(8.dp)
            )
            OutlinedTextField(
                value = psswdState.value, onValueChange = {
                    psswdState.value = it
                },
                label = { Text(text = "Password") },
                modifier = Modifier.padding(8.dp)
            )

            Button(modifier = Modifier.padding(8.dp),
                onClick = {})
             {
                Text(text = "SIGN UP")
            }
            Text(
                text = "Already Have an Account? Go to Login",
                color = Color.Blue,
                modifier = Modifier
                    .padding(8.dp)
            )


        }
    }
}