package com.example.submissionandroidsederhana.presentation.detail_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.submissionandroidsederhana.R
import com.example.submissionandroidsederhana.databinding.ActivityDetailScreenBinding
import com.example.submissionandroidsederhana.presentation.about_screen.AboutActitvity
import com.example.submissionandroidsederhana.presentation.main_screen.MainActivity

class DetailActivityScreen : AppCompatActivity() {

    private lateinit var binding: ActivityDetailScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            val intent = Intent(this@DetailActivityScreen, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnAccount.setOnClickListener{
            val intent = Intent(this@DetailActivityScreen, AboutActitvity::class.java)
            startActivity(intent)
        }

        val foodName = intent.getStringExtra("EXTRA_FOOD_NAME")
        val foodDesc = intent.getStringExtra("EXTRA_FOOD_DESC")
        val foodPhoto = intent.getStringExtra("EXTRA_FOOD_PHOTO")

        binding.tvTitle.text = foodName
        binding.tvDesc.text = foodDesc
        Glide.with(this)
            .load(foodPhoto)
            .into(binding.imgFood)


    }
}