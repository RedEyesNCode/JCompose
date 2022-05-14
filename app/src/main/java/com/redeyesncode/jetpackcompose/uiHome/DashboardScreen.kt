package com.redeyesncode.jetpackcompose.uiHome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.redeyesncode.jetpackcompose.R
import com.redeyesncode.jetpackcompose.setBackground
import com.redeyesncode.jetpackcompose.uiUtils.*


@Composable
fun DASHBOARDUI(){
    // ARRAY LIST IN JAVA == mutableListof() in KOTLIN


    // DESIGNING THE FRAGMENT OF THE HOME ONLY HERE.
    // Will manage the other navigation bar later on.. working on the recycler view in Compose i.e Lazy Column.
    /*LazyColumn - produces a vertically scrolling list
       LazyRow - produces a horizontal scrolling list*/
    Column(modifier = Modifier.fillMaxWidth(1f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        spacer10H10V()
        imageRoundedCornersFillWidth(drawableID = R.drawable.intro_2)
        spacer5H5V()
        simpleLazyRowHorizontal()
        spacer5H5V()
        startEndTextViewsHorizontal(textOne = "Top Sellers", textTwo = "View all")
        lazyRowCustomList()
        startEndTextViewsHorizontal(textOne = "Popular products", textTwo = "View all")
        spacer5H5V()
        popularProductsLazyRow()


    }
}