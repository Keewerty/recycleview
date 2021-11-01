package com.example.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Anggota(
    val imgAnggota: Int,
    val namaAnggota: String,
    val descAnggota: String
) : Parcelable
