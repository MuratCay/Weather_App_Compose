package com.example.weather_app_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyView()
        }
    }
}

@Composable
fun MyView() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Kekod'a Saygı Ve Selamlarımla")
        Image(painter = painterResource(id = R.drawable.cloudy), contentDescription = "cloudy")
        Button(onClick = { }) {
            Text(text = "Devam Et")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, backgroundColor = 0xFF03DAC5)
@Composable
fun DefaultPreview() {
    MyView()
}