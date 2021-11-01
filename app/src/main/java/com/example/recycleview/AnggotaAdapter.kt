package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnggotaAdapter(private val context: Context, private val anggota: List<Anggota>, val listener: (Anggota) -> Unit)
    : RecyclerView.Adapter<AnggotaAdapter.AnggotaViewHolder>(){

    class AnggotaViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgAnggota = view.findViewById<ImageView>(R.id.img_item_photo)
        var namaAnggota = view.findViewById<TextView>(R.id.tv_item_name)
        var descAnggota = view.findViewById<TextView>(R.id.tv_item_description)



        fun  bindview(anggota: Anggota, listener: (Anggota) -> Unit) {
            imgAnggota.setImageResource(anggota.imgAnggota)
            namaAnggota.text = anggota.namaAnggota
            descAnggota.text = anggota.descAnggota

            itemView.setOnClickListener {
                listener(anggota)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewHolder {
        return AnggotaViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: AnggotaViewHolder, position: Int) {
        holder.bindview(anggota[position], listener)
    }

    override fun getItemCount(): Int = anggota.size
    }

