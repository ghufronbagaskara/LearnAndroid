package com.example.submissionandroidsederhana.presentation.main_screen

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    val name: String,
    val desc: String,
    val photo: String
) : Parcelable