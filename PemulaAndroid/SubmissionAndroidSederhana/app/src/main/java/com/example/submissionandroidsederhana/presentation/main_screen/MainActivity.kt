package com.example.submissionandroidsederhana.presentation.main_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.submissionandroidsederhana.R
import com.example.submissionandroidsederhana.databinding.ActivityMainBinding
import com.example.submissionandroidsederhana.presentation.about_screen.AboutActitvity
import com.example.submissionandroidsederhana.presentation.detail_screen.DetailActivityScreen

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val list = ArrayList<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvListFood.setHasFixedSize(true)

        list.addAll(getListFood())
        showRecyclerList()

        binding.btnAccount.setOnClickListener{
            val intent = Intent(this@MainActivity, AboutActitvity::class.java)
            startActivity(intent)
        }

    }

    private fun getListFood(): ArrayList<Food> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDesc = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listFood = ArrayList<Food>()
        for (i in dataName.indices) {
            val food = Food(dataName[i], dataDesc[i], dataPhoto[i])
            listFood.add(food)
        }
        return listFood
    }

    private fun showRecyclerList() {
        binding.rvListFood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        binding.rvListFood.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object: ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food){

                Log.d("MainActivity", "Sending data: ${data.name}, ${data.desc}, ${data.photo}")

                val intent = Intent(this@MainActivity, DetailActivityScreen::class.java)
                intent.putExtra("EXTRA_FOOD_NAME", data.name)
                intent.putExtra("EXTRA_FOOD_DESC", data.desc)
                intent.putExtra("EXTRA_FOOD_PHOTO", data.photo)
                startActivity(intent)

            }
        })
    }

}