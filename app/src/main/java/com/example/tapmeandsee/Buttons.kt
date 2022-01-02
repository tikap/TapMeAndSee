package com.example.tapmeandsee

import android.os.Process
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun Btn_SetUp(){
    Button(onClick = { /*TODO*/ },
        Modifier.padding(buttonPadding),
        shape = RoundedCornerShape(buttonBorderDp),
        border = BorderStroke(Dp.Hairline, Color.Unspecified),
    ) {
        Text(text = "Set Up",
            fontSize = mainMenuFontSize,
            fontWeight = mainMenuFontWeight,
            fontFamily = mainMenuFontFamily,
        )
    }
}

@Composable
fun Btn_Initiate(){
    Button(onClick = { /*TODO*/ },
        Modifier.padding(buttonPadding),
        shape = RoundedCornerShape(buttonBorderDp),
        border = BorderStroke(Dp.Hairline, Color.Unspecified),
    ) {
        Text(text = "Initiate",
            fontSize = mainMenuFontSize,
            fontWeight = mainMenuFontWeight,
            fontFamily = mainMenuFontFamily)
    }
}

@Composable
fun Btn_Exit(){
    Button(onClick = { Process.killProcess(Process.myPid()) },
        Modifier.padding(buttonPadding),
        shape = RoundedCornerShape(buttonBorderDp),
        border = BorderStroke(Dp.Hairline, Color.Unspecified),
    ) {
        Text(text = "Exit",
            fontSize = mainMenuFontSize,
            fontWeight = mainMenuFontWeight,
            fontFamily = mainMenuFontFamily)
    }
}