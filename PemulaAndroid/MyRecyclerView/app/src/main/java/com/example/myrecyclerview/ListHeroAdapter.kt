package com.example.myrecyclerview

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.coroutines.NonDisposableHandle.parent

class ListHeroAdapter(private val listHero: ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    /*Kelas ListViewHolder digunakan sebagai ViewHolder dalam RecyclerView.
    ViewHolder adalah wrapper seperti View yang berisi layout untuk setiap item dalam daftar RecyclerView.
    Di sinilah tempat untuk menginisialisasi setiap komponen pada layout item dengan menggunakan itemView.findViewById.
    Adapter akan membuat objek ViewHolder seperlunya dan menetapkan data untuk tampilan tersebut. Proses mengatribusikan
    tampilan ke datanya disebut binding.*/
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_desc)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    /*Fungsi onCreateViewHolder() digunakan untuk membuat ViewHolder baru yang berisi layout
    item yang digunakan, dalam hal ini yaitu R.layout.item_row_hero. Metode ini membuat serta menginisialisasi
    ViewHolder dan View yang akan diatribusikan. Namun, pada fungsi ini tidak bertujuan mengisi konten tampilan sehingga
    belum terikat dengan data tertentu.*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    // digunakan untuk mengetahui jumlah data yang akan di tampilkan
    override fun getItemCount(): Int = listHero.size

    /*Fungsi onBindViewHolder() digunakan untuk menetapkan data yang ada ke dalam ViewHolder
    sesuai dengan posisinya dengan menggunakan listHero[position]. Misalnya, jika RecyclerView
    yang dibuat bertujuan untuk menampilkan daftar nama, metode tersebut mungkin menemukan nama yang sesuai,
    kemudian menetapkannya pada widget TextView yang ada dalam ViewHolder.*/
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo) = listHero[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDescription.text = description
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listHero[holder.adapterPosition]) }
        /*holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listHero[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }*/
    }

    /*Di sini kita menambahkan interface supaya ketika memanggil fungsi setOnItemClickCallback,
    terdapat data yang dikembalikan. Untuk memasukkan data ke interface, kita cukup memasukkan
    data ke dalam fungsi onClicked di dalam onBindViewHolder ketika itemView ditekan. Kita menggunakan
    holder.itemView karena kita ingin memberikan aksi ketika keseluruhan item ditekan. Apabila Anda
    ingin menempatkan aksi pada view tertentu saja seperti foto, gunakan
    kode seperti holder.imgPhoto.setOnClickListener.*/
    interface OnItemClickCallback {
        fun onItemClicked(data: Hero)
    }

}