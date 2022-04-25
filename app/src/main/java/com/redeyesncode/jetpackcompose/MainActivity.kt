package com.redeyesncode.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.redeyesncode.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            rowsInJetPackCompose()
        }


    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}



//Making some basic compose functions in android using the Jetpack compose.
@Composable
fun textViewInCompose(){
    Text(text = "This is text in Jetpack Compose.")
}

//Making Rows i.e which are LinearLayouts with Horizontal Orientation for every element that's inside of it.
@Preview
@Composable
fun rowsInJetPackCompose(){
    Row { // Every element inside this will be arranged horizontally.

        Column { //Every element inside this be arranged vertially.

            Text(text = "Text One")
            Text(text = "Text Two")
        }
        Text(text = "Text Three")
        Text(text = "Text Four")

    }
}




