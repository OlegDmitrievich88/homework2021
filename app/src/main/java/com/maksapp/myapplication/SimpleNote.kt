package com.maksapp.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class SimpleNote(
    val title: String,
    val desc: String,
    val date: String
): Parcelable

fun getNote(): Array<SimpleNote>{
    return arrayOf(
        SimpleNote("Работа))","ура на работу","9.00"),
        SimpleNote("Работа)","на работу","9.00"),
        SimpleNote("Работа(","опять на работу","9.00"),
        SimpleNote("Работа((","снова гребаная работа","9.00")
    )
}





