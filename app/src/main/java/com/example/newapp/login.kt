package com.example.newapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newapp.ui.theme.NewappTheme

class login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Af()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Af() {
    val goto = LocalContext.current
    var text6 by remember { mutableStateOf(TextFieldValue("")) }
    var text7 by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier .padding(50.dp)
        ,horizontalAlignment  = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(R.drawable.icon ),
            contentDescription = "Circle Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape) // clip to the circle shape
                .border(1.dp, Color.Gray, CircleShape)//optional
        )

        Text(text = "LOGIN",color=Color.Blue)
        OutlinedTextField(
            value = text6,
            label = { Text(text = "username/email") },
            onValueChange = {
                text6 = it
            }
        )

        OutlinedTextField(
            value = text7,
            label = { Text(text = " password") },
            onValueChange = {
                text7 = it
            }
        )
        Row {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "login", color = Color.Black)

            }
            Spacer(modifier = Modifier.width(10.dp))


            Text( "Back",color=Color.Blue, modifier = Modifier
                .clickable{ goto.startActivity(Intent(goto,MainActivity::class.java)) })
        }
    }
}
