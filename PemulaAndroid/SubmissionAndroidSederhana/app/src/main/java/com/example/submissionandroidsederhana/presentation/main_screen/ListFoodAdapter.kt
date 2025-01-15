package com.example.submissionandroidsederhana.presentation.main_screen

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.submissionandroidsederhana.databinding.ItemRowFoodBinding

class ListFoodAdapter(private val listFood: ArrayList<Food>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(val binding: ItemRowFoodBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int = listFood.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Log.d("Adapter", "Loading image: ${food.photo}")

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .into(holder.binding.imgFood)

        holder.binding.tvTitle.text = food.name
        holder.binding.tvDesc.text = food.desc

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(food)
        }
    }


}