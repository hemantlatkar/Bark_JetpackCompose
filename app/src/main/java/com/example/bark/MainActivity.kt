package com.example.bark

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.data.model.Puppy
import com.example.bark.ui.theme.BarkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarkTheme {
                MyApp()
            }
        }
    }
}


@Composable
fun MyApp() {
    Scaffold(
        content = {
            BarkHomeContent()
        }
    )
}