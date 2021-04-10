package com.example.collections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    fun main() {
        val values = IntArray(5)
        values[0] = 1
        values[1] = 20
        values[2] = 11
        values[3] = 30
        values[4] = 15

        println("--------------------------")

        for (valor in values) {
            println(valor)
        }

        println("--------------------------")

        values.forEach {
            println(it)
        }

        println("--------------------------")

        for (index in values.indices) {
            println(values[index])
        }

        println("--------------------------")

        values.sort()
        for (valor in values)
            println(valor)
    }
}