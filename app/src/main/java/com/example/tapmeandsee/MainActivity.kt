package com.example.tapmeandsee

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tapmeandsee.ui.theme.TapMeAndSeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainMenu()
        }
    }
}

@Composable
fun MainMenu() {
    val padding = 30.dp
    val mainMenuFontSize = 50.sp
    val mainMenuFontWeight = FontWeight.Bold
    val mainMenuFontFamily = FontFamily.SansSerif

    Column(
        Modifier
            .clickable{}
            .padding(padding)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            "Initiate",
            fontSize = mainMenuFontSize,
            fontWeight = mainMenuFontWeight,
            fontFamily = mainMenuFontFamily
        )
        Text("Set Up",
            fontSize = mainMenuFontSize,
            fontWeight = mainMenuFontWeight,
            fontFamily = mainMenuFontFamily
        )
        Text("Exit",
            fontSize = mainMenuFontSize,
            fontWeight = mainMenuFontWeight,
            fontFamily = mainMenuFontFamily
        )
    }
}

@Preview
@Composable
fun PreviewMainMenu(){
    MainMenu()
}