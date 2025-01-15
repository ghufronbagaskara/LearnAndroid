package com.example.design_raion_academy.models

import androidx.annotation.DrawableRes

// membuat blueprint
data class Dessert(
    @DrawableRes val image: Int,
    val price: Int,
    val minimumSold: Int
)
