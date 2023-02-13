package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlintest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMain.setOnClickListener {

            val total = getTitleFromServer(1 , 5)
            var a = total
            startActivity(Intent(this@MainActivity , SecondActivity::class.java))
        }
    }

    fun getTitleFromServer(firstNum: Int, secondNum: Int): Int {

        return firstNum + secondNum

    }

}