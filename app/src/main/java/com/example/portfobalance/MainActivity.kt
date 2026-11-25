package com.example.portfobalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.portfobalance.ui.navigation.AppNavigation
import com.example.portfobalance.ui.theme.PortfoBalanceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortfoBalanceTheme {
                AppNavigation()
            }
        }
    }
}