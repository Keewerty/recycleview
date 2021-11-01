package com.example.recycleview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT _INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anggotalist = listOf<Anggota>(
            Anggota(
                R.drawable.alfath,
                "Alfath",
                descAnggota = "Absen 3"


            ),

            Anggota(
                R.drawable.daffa,
                "Daffa",
                descAnggota = "Absen 11"

            ),

            Anggota(
                R.drawable.ihza,
                "Ihza",
                descAnggota = "Absen 15"
            ),

            Anggota(
                R.drawable.rikza,
                "Rikza",
                descAnggota = "Absen 31"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_name)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AnggotaAdapter(this, anggotalist){
            val intent = Intent(this, DetailAnggotaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}