package com.example.portfobalance.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Splash.route) { PlaceholderScreen("Splash Screen") }
        composable(Screen.Login.route) { PlaceholderScreen("Halaman Login PortfoBalance") }
        composable(Screen.Register.route) { PlaceholderScreen("Halaman Register") }
        composable(Screen.InvestorDashboard.route) { PlaceholderScreen("Dashboard Investor") }
        composable(Screen.AdminDashboard.route) { PlaceholderScreen("Dashboard Admin") }
        composable(Screen.Wallets.route) { PlaceholderScreen("Dompet Sekuritas") }
        composable(Screen.Transactions.route) { PlaceholderScreen("Transaksi Investasi") }
        composable(Screen.Rebalancing.route) { PlaceholderScreen("Target Alokasi & Rebalancing") }
        composable(Screen.Watchlist.route) { PlaceholderScreen("Watchlist") }
        composable(Screen.Reports.route) { PlaceholderScreen("Ekspor Laporan") }
        composable(Screen.ReportFiles.route) { PlaceholderScreen("File Laporan Lokal") }
        composable(Screen.MasterAssets.route) { PlaceholderScreen("Kelola Master Aset") }
        composable(Screen.AssetCategories.route) { PlaceholderScreen("Kelola Kategori Aset") }
        composable(Screen.HelpProfile.route) { PlaceholderScreen("Bantuan & Profil") }
    }
}

@Composable
private fun PlaceholderScreen(title: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = title)
    }
}