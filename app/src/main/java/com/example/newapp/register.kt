package com.example.newapp

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newapp.ui.theme.NewappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            At()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)

@Composable
fun At(){
    val goto = LocalContext.current
    var text by remember { mutableStateOf(TextFieldValue("")) }
    var text1 by remember { mutableStateOf(TextFieldValue("")) }
    var text2 by remember { mutableStateOf(TextFieldValue("")) }
    var text3 by remember { mutableStateOf(TextFieldValue("")) }
    var text4 by remember { mutableStateOf(TextFieldValue("")) }
    var text5 by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier .padding(50.dp)
        ,horizontalAlignment  = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(R.drawable.reg),
            contentDescription = "Circle Image",

            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape) // clip to the circle shape
                .border(2.dp, Color.Gray, CircleShape)//optional
        )




                Text(text = "account registration")
        OutlinedTextField(
            value = text,
            label = { Text(text = "first name") },
            onValueChange = {
                text = it
            }
        )
        OutlinedTextField(
            value = text1,
            label = { Text(text = "last name") },
            onValueChange = {
                text1 = it
            }
        )
        OutlinedTextField(
            value = text2,
            label = { Text(text = "d.o.b") },
            onValueChange = {
                text2 = it
            }
        )
        OutlinedTextField(
            value = text3,
            label = { Text(text = "email address") },
            onValueChange = {
                text3 = it
            }
        )
        OutlinedTextField(
            value = text4,
            label = { Text(text = "password") },
            onValueChange = {
                text4 = it
            }
        )
        OutlinedTextField(
            value = text5,
            label = { Text(text = "confirm password") },
            onValueChange = {
                text5 = it
            }
        )
        Row(){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Register", color = Color.Black)
            }
            Spacer(modifier = Modifier.width(10.dp))




            Text( "already have an account",color=Color.Blue, modifier = Modifier
                .clickable{ goto.startActivity(Intent(goto,login::class.java)) })

        }

        }

    }



