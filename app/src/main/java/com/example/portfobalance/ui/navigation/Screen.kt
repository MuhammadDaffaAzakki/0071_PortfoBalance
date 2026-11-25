package com.example.portfobalance.ui.navigation

sealed class Screen(val route: String) {
    data object Splash : Screen("splash")
    data object Login : Screen("login")
    data object Register : Screen("register")
    data object InvestorDashboard : Screen("investor_dashboard")
    data object AdminDashboard : Screen("admin_dashboard")
    data object Wallets : Screen("wallets")
    data object Transactions : Screen("transactions")
    data object Rebalancing : Screen("rebalancing")
    data object Watchlist : Screen("watchlist")
    data object Reports : Screen("reports")
    data object ReportFiles : Screen("report_files")
    data object MasterAssets : Screen("master_assets")
    data object AssetCategories : Screen("asset_categories")
    data object HelpProfile : Screen("help_profile")
}
