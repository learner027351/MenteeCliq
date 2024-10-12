package com.example.menticliq.Screens

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent.Modifier



@Composable
fun rfa(){
    Surface (
        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
        color = Color.Blue
    ){
        RegForm()
    }
}




@Composable
fun RegForm(){
    var tenthMarks by remember{ mutableStateOf("") }
    var twelfthMarks by remember{ mutableStateOf("") }
    var hobbies by remember{ mutableStateOf("") }
    var fieldofInterste by remember{ mutableStateOf("") }
    var skills by remember{ mutableStateOf("") }
    var weakness by remember{ mutableStateOf("") }
    var strength by remember{ mutableStateOf("") }
    var personality by remember{ mutableStateOf("") }
    var goals by remember{ mutableStateOf("") }

    Column (
        modifier = androidx.compose.ui.Modifier.fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Personal Details",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = androidx.compose.ui.Modifier.align(Alignment.Start)
        )
        //10th Marks
        TextField(
            value = tenthMarks,
            onValueChange = {tenthMarks=it},
            label = { Text("10th Marks") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = twelfthMarks,
            onValueChange = {twelfthMarks=it},
            label = { Text("12th Marks") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        //Hobies
        TextField(
            value = hobbies,
            onValueChange = {hobbies=it},
            label = { Text("Hobbies") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        )
        //Field Of Interest
        TextField(
            value = fieldofInterste,
            onValueChange = {fieldofInterste=it},
            label = { Text("Field Of Interest") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        )
        //Skills
        TextField(
            value = skills,
            onValueChange = {skills=it},
            label = { Text("Skills") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        )
        //Weakness
        TextField(
            value = weakness,
            onValueChange = {weakness=it},
            label = { Text("Your Weakness") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        )
        //Strength
        TextField(
            value = strength,
            onValueChange = {strength=it},
            label = { Text("Your Strength") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        )
        //Personality
        Text(
            text = "Personality",
            fontWeight = FontWeight.Bold,
            modifier = androidx.compose.ui.Modifier.align(Alignment.Start)
        )
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            RadioButton(
                selected = personality=="Extrovert",
                onClick = {personality="Extrovert"}
            )
            Text(
                text = "Extrovert",
            )
            RadioButton(
                selected = personality=="Introvert",
                onClick = {personality="Introvert"}
            )
            Text("Introvert")
            RadioButton(
                selected = personality=="Ambivert",
                onClick = {personality="Ambivert"}
            )
            Text("Ambivert")

        }
        //Goals
        TextField(
            value = goals,
            onValueChange = {goals=it},
            label = { Text("Your Goals") },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        )
        Button(
            onClick = {

            },
            modifier =androidx.compose.ui.Modifier.align(Alignment.CenterHorizontally)
        ){
            Text("Submit")
        }
    }

}
@Preview(showBackground = true)
@Composable
fun RegFormPreview(){
    RegForm()
}