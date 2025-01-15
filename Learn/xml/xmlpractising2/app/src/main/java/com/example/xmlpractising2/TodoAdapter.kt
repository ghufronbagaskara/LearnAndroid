package com.example.xmlpractising2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlpractising2.databinding.ActivityMainBinding
import com.example.xmlpractising2.databinding.ItemTodoBinding

class TodoAdapter(
    var todos: List<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(private val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(todo : Todo){
            binding.tvTittle.text = todo.title
            binding.cbDone.isChecked = todo.isCheckedState
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTodoBinding.inflate(inflater, parent, false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todos[position])
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}

//class TodoAdapter(
//    var todos: List<Todo>
//) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
//
//    private lateinit var binding: ItemTodoBinding
//
//    inner class TodoViewHolder(private val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
//        return TodoViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
//        holder.itemView.apply {
//            binding = ItemTodoBinding.bind(this)
//            binding.tvTittle.text = todos[position].title
//            binding.cbDone.isChecked = todos[position].isCheckedState
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return todos.size
//    }
//}