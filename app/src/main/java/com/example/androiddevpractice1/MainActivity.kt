package com.example.androiddevpractice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androiddevpractice1.ui.theme.AndroidDevPractice1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidDevPractice1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun HelloWorldText( message: String, from: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        fontSize = 116.sp,
        lineHeight = 100.sp
    )
    Text(
        text = from,
        fontSize = 36.sp
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidDevPractice1Theme {
        HelloWorldText(message = "Hello World!", from = "From Robel")
    }
}