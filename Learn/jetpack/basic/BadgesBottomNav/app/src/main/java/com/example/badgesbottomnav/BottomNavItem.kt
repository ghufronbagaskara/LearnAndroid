package com.example.badgesbottomnav

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgesCount: Int = 0
)
