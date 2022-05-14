package com.redeyesncode.jetpackcompose.uiUtils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redeyesncode.jetpackcompose.R
import com.redeyesncode.jetpackcompose.setBackground
import com.redeyesncode.jetpackcompose.uiHome.spacer10H10V
import com.redeyesncode.jetpackcompose.uiHome.spacer10H15V
import com.redeyesncode.jetpackcompose.uiHome.spacer5H5V
import com.redeyesncode.jetpackcompose.uiHome.textBlack9dpSize
import com.redeyesncode.jetpackcompose.uiUtils.recyclerCompose.model.ImageNameBooleanModel
import com.redeyesncode.jetpackcompose.uiUtils.recyclerCompose.model.ImageNameModel


@Composable
fun simpleLazyColumnVertical(){
    //THIS DEFINES THE LAYOUT FOR OUR RECYCLER VIEW
    var listModifer = Modifier
        .wrapContentSize()
        .background(color = Color.DarkGray)
        .padding(10.dp)

    // STATIC LIST TO PASS INTO THE RECYCLER VIEW.
    var simpleStringList = mutableListOf<String>("India","Pakistan","United States","Russia")


    LazyColumn( listModifer){
        // Now there are two ways to add items in the recycler view in jetpack compose.
        // 1. item() 2.items(pass_your_list_here)
        item { textBlack9dpSize(name = "Header.") }
        items(simpleStringList){index ->
            //THIS IS JUST LIKE PASSING THE LIST TO THE ADAPTER.
            // AND THE INDEX ITERATES OVER TO EACH ELEMENT OF THE LIST YOU CAN PASS
            // A CUSTOM MODEL LIST AND CREATE A LAYOUT INSIDE ITEMS AND CUSTOMISE THE
            // RECYCLER ACCORDINGLY SO AMAZING ! BYE BYE ADAPTERS :)
            textBlack9dpSize(name = index)
        }
        item { textBlack9dpSize(name = "Footer.") }
    }
}

@Composable
fun simpleLazyRowHorizontal(){
    //THIS DEFINES THE LAYOUT FOR OUR RECYCLER VIEW
    var listModifer = Modifier
        .wrapContentSize()
//        .background(color = Color.DarkGray)
        .padding(10.dp)

    // STATIC LIST TO PASS INTO THE RECYCLER VIEW.
    var simpleStringList = mutableListOf<String>("All","Lash Accessories","Mobile Phones","Computer Parts", "Tweezers", "Lash Extensions","Kids","Apparel","Tweezer Bundle")


    LazyRow( listModifer){
        // Now there are two ways to add items in the recycler view in jetpack compose.
        // 1. item() 2.items(pass_your_list_here)
        items(simpleStringList){index ->
            Text(text = index,Modifier.padding(4.dp,0.dp), color = colorResource(id = R.color.black),fontSize = 9.sp, fontFamily = FontFamily(Font(R.font.roboto_bold)))
        }
    }
}

@Composable
fun  lazyColumnCustomList(){

    var listModifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
//        .background(color = Color.White)

    // Creating the list for the recycler view or you can also get it from the api , if you know how to integerate the api with
    // jetpack compose.

    var imageNameModel  = mutableListOf<ImageNameModel>()
    imageNameModel.add(ImageNameModel("Street 32",R.drawable.hairdresser))
    imageNameModel.add(ImageNameModel("A1",R.drawable.blacktshirt))
    imageNameModel.add(ImageNameModel("#Markup",R.drawable.basic_kit))
    imageNameModel.add(ImageNameModel("The Lashes House",R.drawable.influencer))
    imageNameModel.add(ImageNameModel("Sarlin",R.drawable.intro_1))
    imageNameModel.add(ImageNameModel("Bold Eyes",R.drawable.beauty))
    //LIST IS READY.
    
    LazyColumn(listModifier, contentPadding = PaddingValues(10.dp)){
        items(imageNameModel){ item: ImageNameModel ->
            // here item represent the single item present in the list according to the index of the recycler.
            // DESIGN OF THE CUSTOM LAYOUT HERE. >> I am just using another composable
            imageNameLayout(name = item.name, drawableID = item.image)

        }



    }
}


@Composable
fun  lazyRowCustomList(){
    var listModifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
//        .background(color = Color.White)
    // Creating the list for the recycler view or you can also get it from the api , if you know how to integerate the api with
    // jetpack compose.
    var imageNameModel  = mutableListOf<ImageNameModel>()
    imageNameModel = setListData(imageNameModel)
    //LIST IS READY.
    LazyRow(listModifier, contentPadding = PaddingValues(20.dp,0.dp)){
        items(imageNameModel){ item: ImageNameModel ->
            // here item represent the single item present in the list according to the index of the recycler.
            // DESIGN OF THE CUSTOM LAYOUT HERE. >> I am just using another composable

            imageNameLayout(name = item.name, drawableID = item.image)

        }
    }
}

@Composable
fun popularProductsLazyRow(){
    var listModifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)

    var imageNameBooleanModel = mutableListOf<ImageNameBooleanModel>()
    imageNameBooleanModel = setListPopularProduct(imageNameBooleanModel)

    LazyRow(listModifier, contentPadding = PaddingValues(10.dp,0.dp)){
        items(imageNameBooleanModel){item: ImageNameBooleanModel ->
            popularProductLayout(productName = item.name, drawableID = item.image, isWishlist = item.isWishlist)
        }
    }
}



@Composable
fun popularProductLayout(productName:String, drawableID: Int,isWishlist:Boolean){
    Column(modifier = Modifier.fillMaxSize()){
//        imageRoundedCorners(drawableID = drawableID)
        Image(painter = painterResource(id = drawableID), contentDescription = "Product Image", modifier = Modifier.size(165.dp))
        spacer5H5V()
        Text(text = productName, modifier = Modifier.fillMaxWidth(1f), fontSize = 10.sp,textAlign = TextAlign.Center)

    }
}



@Composable
fun imageNameLayout(name:String,drawableID:Int){
    Row() {
        
    }
    Column (modifier = Modifier.fillMaxWidth(1f), horizontalAlignment = Alignment.CenterHorizontally){
        imageRoundedCorners(drawableID = drawableID)
        spacer5H5V()
        Text(text = name, modifier = Modifier.fillMaxWidth(1f), fontSize = 10.sp,textAlign = TextAlign.Center)
    }
}

@Composable
fun imageRoundedCorners(drawableID: Int){
    Image(painter = painterResource(id = drawableID), contentDescription = "LIST_IMAGE", modifier = Modifier
        .size(115.dp)
        .padding(2.dp, 0.dp)
        .clip(
            RoundedCornerShape(CornerSize(12.dp))
        ), contentScale = ContentScale.Crop)
    // THE CONTENT SCALE FOR THE IMAGE .CROP is same as FitXY in XML.

}
@Composable
fun imageRoundedCornersFillWidth(drawableID: Int){

    // By using modifier clip property you can give shape to any jetpack compose element.

    Image(painter = painterResource(id = drawableID), contentDescription = "LIST_IMAGE", modifier = Modifier
        .fillMaxWidth(1f)
        .padding(18.dp, 0.dp)
        .height(175.dp)
        .clip(
            RoundedCornerShape(CornerSize(12.dp))
        ), contentScale = ContentScale.Crop)
    // THE CONTENT SCALE FOR THE IMAGE .CROP is same as FitXY in XML.

}

fun setListData(imageNameModel: MutableList<ImageNameModel>):MutableList<ImageNameModel>{
    imageNameModel.add(ImageNameModel("Street 32",R.drawable.hairdresser))
    imageNameModel.add(ImageNameModel("A1",R.drawable.blacktshirt))
    imageNameModel.add(ImageNameModel("Sarlin",R.drawable.intro_1))
    imageNameModel.add(ImageNameModel("#Markup",R.drawable.basic_kit))
    imageNameModel.add(ImageNameModel("The Lashes House",R.drawable.influencer))
    imageNameModel.add(ImageNameModel("Bold Eyes",R.drawable.beauty))
    imageNameModel.add(ImageNameModel("Street 32",R.drawable.hairdresser))
    imageNameModel.add(ImageNameModel("A1",R.drawable.blacktshirt))
    imageNameModel.add(ImageNameModel("#Markup",R.drawable.basic_kit))
    imageNameModel.add(ImageNameModel("The Lashes House",R.drawable.influencer))
    imageNameModel.add(ImageNameModel("Sarlin",R.drawable.intro_1))
    imageNameModel.add(ImageNameModel("Bold Eyes",R.drawable.beauty))
    return  imageNameModel
}

fun setListPopularProduct(imageNameModel: MutableList<ImageNameBooleanModel>):MutableList<ImageNameBooleanModel>{

    imageNameModel.add(ImageNameBooleanModel("Street 32",R.drawable.hairdresser, false))
    imageNameModel.add(ImageNameBooleanModel("A1",R.drawable.blacktshirt,true))
    imageNameModel.add(ImageNameBooleanModel("Sarlin",R.drawable.intro_1,true))
    imageNameModel.add(ImageNameBooleanModel("#Markup",R.drawable.basic_kit,true))
    imageNameModel.add(ImageNameBooleanModel("The Lashes House",R.drawable.influencer,true))
    imageNameModel.add(ImageNameBooleanModel("Bold Eyes",R.drawable.beauty,false))
    imageNameModel.add(ImageNameBooleanModel("Street 32",R.drawable.hairdresser,false))
    imageNameModel.add(ImageNameBooleanModel("A1",R.drawable.blacktshirt,false))
    imageNameModel.add(ImageNameBooleanModel("#Markup",R.drawable.basic_kit,false))
    imageNameModel.add(ImageNameBooleanModel("The Lashes House",R.drawable.influencer,true))
    imageNameModel.add(ImageNameBooleanModel("Sarlin",R.drawable.intro_1,false))
    imageNameModel.add(ImageNameBooleanModel("Bold Eyes",R.drawable.beauty,false))

    return imageNameModel

}

