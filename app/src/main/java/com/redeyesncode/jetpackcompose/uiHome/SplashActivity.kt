package com.redeyesncode.jetpackcompose.uiHome

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.redeyesncode.jetpackcompose.MainActivity
import com.redeyesncode.jetpackcompose.R
import com.redeyesncode.jetpackcompose.uiHome.ui.theme.JetpackComposeTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.redeyesncode.jetpackcompose.uiHome.splashScreen()
        }
        var handler = Handler().postDelayed(Runnable {
                                                     var intent = Intent(this@SplashActivity,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)

        },1500)
    }
}


@Preview
@Composable
fun splashScreen(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.ic_jetpack), contentDescription = "Jetpack Compose")
    }
}