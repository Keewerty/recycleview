package com.example.recycleview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailAnggotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_anggota)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anggota = intent .getParcelableExtra<Anggota>(MainActivity.INTENT_PARCELABLE)

        val imgAnggota = findViewById<ImageView>(R.id.img_item_photo)
        val namaAnggota = findViewById<TextView>(R.id.tv_item_name)
        val descAnggota = findViewById<TextView>(R.id.tv_item_description)

        imgAnggota.setImageResource(anggota?.imgAnggota!!)
        namaAnggota.text = anggota.namaAnggota
        descAnggota.text = anggota.descAnggota

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}