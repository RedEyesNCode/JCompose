package com.redeyesncode.jetpackcompose.uiUtils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.redeyesncode.jetpackcompose.R

//This Kotlin File Generally contains other view or ui elements that are basically common in the entire app.


@Composable
fun simpleButton(buttonText:String){
    // THE ELEMENTS YOU PUT INSIDE THE BUTTON ARE ALWAYS ARRANGED,
    // HORIZONTALLY.
    
    Button(onClick = { /*TODO*/ }) {
        Text(text =buttonText)
    }
}
@Composable
fun buttonWithCustomBackgroundColor(){
    
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(
        id = R.color.purple_perfect
    ))) {
        //SETTING A CUSTOM TEXT COLOR OF THE BUTTON ALSO.
        Text(text = "Custom Color Button !", color = colorResource(id = R.color.white))
    }
}

@Composable
fun buttonWithMultipleText(textOne:String,textTwo:String){
    Button(onClick = { /*TODO*/ }) {
        Text(text = textOne, color = Color.Cyan)
        Text(text = textTwo, color = Color.Red)
    }
}
@Composable
fun buttonWithIcon(){
    Button(onClick = { /*TODO*/ }) {
        Image(painter = painterResource(id = R.drawable.ic_add_cart), modifier = Modifier.size(10.dp), contentDescription ="Button with icon" )
        Text(text = "Add to cart")
    }
}
@Composable
fun buttonWithShapes(){
    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(CornerSize(8.dp))) {
        Text(text = "Rounded Corner Button.")
    }
}

