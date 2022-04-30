package com.redeyesncode.jetpackcompose.uiHome

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redeyesncode.jetpackcompose.R

@Preview
@Composable
fun LoginScreenUI() {
    //MAIN COLOUMN TO ADD SPACING TO THE ENTIRE LAYOUT.

    Column(modifier = Modifier
        .background(colorResource(id = R.color.blue_login))
        .fillMaxSize()) {
        Column(modifier = Modifier
            .padding(10.dp, 10.dp)) {
            //Adding the back Icon in the Login Screen
            Image(painter = painterResource(id = R.drawable.left), modifier = Modifier.size(35.dp,35.dp), contentDescription = "Back Icon !")
            Column(
                Modifier
                    //THERE IS NOT SUCH THING AS MARGIN IN MARGIN IN COMPOSE
                    // YOU CAN BUT APPLY PADDING TO THE SAME COMPOSABLE MULTIPLE TIMES.
                    .wrapContentSize()
                    .padding(0.dp, 30.dp, 0.dp, 0.dp)) {
                Text(text = "Welcome ", fontFamily = FontFamily(Font(R.font.roboto_bold, FontWeight.Bold)),fontSize = 30.sp,color = Color.White, modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight())
                //used to add space bettween the two elements
                Spacer(modifier = Modifier.padding(0.dp,5.dp))
                //REMEMBER THAT THE TEXT COMPOSABLE ONLY TAKES TEXT SIZE IN SP UNITS.
               /* Text(text = "Back !", fontSize = 30.sp,color = Color.White, modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight())*/
                textWhite30Size(name = "Back !")
                SimpleTextField("Enter your Email Here !")
                passwordEditText(hint = "Enter your password Here !")

            }
        }
    }
}

//YOU CAN ALSO MAKE A SINGLE COMPOSABLE FOR BOTH THE TEXT WHICH IS WELCOME , BACK AND
//PLACE IT ACCORDINLY BELOW IS THE COMMENTED CODE for That. still it will look exactly the same.
@Composable
fun textWhite30Size(name:String){

    Text(text = name, fontSize = 30.sp, fontFamily = FontFamily(Font(R.font.roboto_bold, FontWeight.Bold)),color = Color.White, modifier = Modifier
        .wrapContentWidth()
        .wrapContentHeight())

}

@Composable
fun SimpleTextField(hint:String ) {
    //REMEBERING THE INTIAL STATE OF THE EDIT TEXT.
    var text by remember {
        mutableStateOf("")
    }

    TextField(value = text, onValueChange = {
        //CHANGING THE TEXT ACCORDING TO THE VALUE AND SETTING IT TO THE EDIT TEXT FIELD.
                                            text = it
    }, label = { Text(text = hint)})
}
//JETPACK COMPOSE IS AMAZING USE THE SAME COMPOSABLE(VIEW) AS MANY TIME AS YOU LIKE
@Composable
fun passwordEditText(hint :String){

    var password by remember {
        mutableStateOf("")
    }

//    THE KEYBOARD TYPE IS A COOL FEATURE OF THE JETPACK COMPOSE
    TextField(value = password, onValueChange = {
        password= it
        //VISUAL TRANSFORMATION IS THE FIELD TO SET THE FIELD VALUE TO THE PASSWORD.
    }, visualTransformation = PasswordVisualTransformation(),label ={Text(text = hint)} ,keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.None, autoCorrect = false, keyboardType = KeyboardType.Email, imeAction = ImeAction.None))
}



