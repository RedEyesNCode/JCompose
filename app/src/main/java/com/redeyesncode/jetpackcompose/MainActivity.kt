package com.redeyesncode.jetpackcompose

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.redeyesncode.jetpackcompose.uiHome.LoginScreenUI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loginScreen()
        }


    }
}

@Preview
@Composable
fun loginScreen(){
    //REMEMBER THAT COMPOSABLE FUNTIONS CAN ONLY BE CALLED FROM INSIDE OTHER
    // COMPOSABLE FUNCTIONS IN ANDROID.

    LoginScreenUI()


}



//Making some basic compose functions in android using the Jetpack compose.
@Composable
fun textViewInCompose(){
    Text(text = "This is text in Jetpack Compose.")
}

//Making Rows i.e which are LinearLayouts with Horizontal Orientation for every element that's inside of it.
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
@Composable
fun messageCard(){
    Row {
       //Define the image here
//        Image(painter = painterResource(id = R.drawable.home_48), contentDescription = "Sample Image Card")


        //Define the two text inside a coloumn
        Column {

            Spacer(modifier = Modifier.padding(0.dp,10.dp))
            Text(text = "This is a sample test for image card.")
            Spacer(modifier = Modifier.padding(25.dp,0.dp))
            Text(text = "This is an example of the image card in Jetpack Compose.")
        }



    }


}
@Preview
@Composable
fun emailEditText(){

    TextField(value = "Enter your email here", onValueChange = {
        if(it.isEmpty()){
            Log.i(ContentValues.TAG, "emailEditText: Email Field is empty !")
        }else{

            Log.i(ContentValues.TAG, "emailEditText: Email is not Empty")
        }

    })



}





