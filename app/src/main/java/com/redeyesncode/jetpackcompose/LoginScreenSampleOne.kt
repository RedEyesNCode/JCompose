package com.redeyesncode.jetpackcompose

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.redeyesncode.jetpackcompose.uiHome.*
import com.redeyesncode.jetpackcompose.uiUtils.buttonWithCustomBackgroundColor

@Composable
fun LoginScreenSampleOne(context: Context){
    setBackground(drawableId = R.drawable.login_bg)
    Column {
        header()
        body()
        footer(context)

    }
}
@Composable
fun header(){
    Column(modifier = Modifier.fillMaxWidth(1f), horizontalAlignment = Alignment.CenterHorizontally) {
        // First is the Logo of the app
        // second if the text of the header or the name of the screen.
        Image(painter = painterResource(id = R.drawable.ic_jetpack), modifier = Modifier
            .width(165.dp)
            .height(165.dp), contentDescription = "SAMPLE LOGIN SCREEN ONE ICON")
        textBlack30Size(name = "Welcome to Compose !")

    }

}

@Composable
fun footer(context: Context){
    spacer10H15V()
    spacer10H15V()
    Column(modifier = Modifier.fillMaxWidth(1f), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
                         var intentDashboardActivity = Intent(context,DashboardActivity::class.java)
            context.startActivity(intentDashboardActivity)
        }, modifier = Modifier.padding(25.dp)) {
            Text(text = "Login")
        }
//        buttonWithCustomBackgroundColor()
    }




}


@Composable
fun body(){
    // play with the modifier fillMaxWidth , wrapContentSize, and more to get a hang of it.
    Column(modifier = Modifier.fillMaxWidth(1f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        //PLACE THE TWO EDIT TEXT HERE FOR THE EMAIL AND PASSWORD FIELD.
        spacer10H15V()
        spacer10H15V()
        spacer10H15V()
        emailEditText()
        spacer10H15V()
        passwordEditText(hint = "Enter your password")
        spacer10H10V()
        textBlack9dpSize(name = "Forgot your password ?")
    }


}

@Composable
fun setBackground(drawableId:Int){

    Image(painter = painterResource(id = drawableId), modifier = Modifier.fillMaxSize(1f), contentDescription ="Login background." )
}



