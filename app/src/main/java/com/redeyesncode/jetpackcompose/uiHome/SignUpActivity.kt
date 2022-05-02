package com.redeyesncode.jetpackcompose.uiHome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.jetpackcompose.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        //REMEMBER TO USE A JETPACK COMPOSE ACTIVITY INSTEAD OF A SIMPLE EMPTY ACTIVITY IN KOTLIN THERE'S A DIFFERENCE IN BOTH
        //THIS ACTIVITY EXTENDS THE APP COMPACT ACTIVITY AND THE ACTIVITY HAVING COMPOSABLES EXTENDS THE ComponentActivity.
        // YOU CAN USE BOTH COMPOSABLES AND XML FILES AT THE SAME TIME IN THE SAME PROJECT.
    }
}