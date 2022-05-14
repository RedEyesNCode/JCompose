package com.redeyesncode.jetpackcompose.uiHome

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DASHBOARD_COMPOSE(context = LocalContext.current)
        }
    }
}
@Composable
fun DASHBOARD_COMPOSE(context: Context){
    DASHBOARDUI()

}

