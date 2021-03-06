package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragmentToActivity()
    }

    private fun addFragmentToActivity() {
        supportFragmentManager.beginTransaction()
            .add(R.id.container, FirstPageFragment(), "FirstPage")
            .commit()
    }
}