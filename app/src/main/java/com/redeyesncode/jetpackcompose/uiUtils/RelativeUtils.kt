package com.redeyesncode.jetpackcompose.uiUtils

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redeyesncode.jetpackcompose.R

@Composable
fun startEndTextViewsHorizontal(textOne:String, textTwo:String){

    // FOR RELATIVE TEXT VIEWS LIKE IN XML JUST USE THE PROPERTY OF ALIGNMENT IN MODIFIER.

    Box(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Text(
            textOne,
            Modifier
                .padding(9.dp)
                .align(Alignment.CenterStart),
        )
        Text(
            textTwo,
            fontFamily = FontFamily(Font(R.font.roboto_medium)),
            color = colorResource(id = R.color.purple_perfect),
            modifier = Modifier.padding(9.dp).align(Alignment.CenterEnd)
        )
    }
}
