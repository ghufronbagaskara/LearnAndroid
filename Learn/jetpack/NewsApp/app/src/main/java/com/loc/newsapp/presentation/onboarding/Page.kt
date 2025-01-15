package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Lorem ipsum is simple dummy",
        description = "Lorem ipsum is simply dummy text of printing and typesetting the industry.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ipsum is simple dummy",
        description = "Lorem ipsum is simply dummy text of printing and typesetting the industry.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ipsum is simple dummy",
        description = "Lorem ipsum is simply dummy text of printing and typesetting the industry.",
        image = R.drawable.onboarding3
    )
)