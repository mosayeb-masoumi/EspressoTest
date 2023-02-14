package com.example.kotlintest.main_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.kotlintest.SecondActivity
import com.example.kotlintest.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMain.setOnClickListener {

            val total = getTitleFromServer(1 , 5)
            var a = total
            startActivity(Intent(this@MainActivity , SecondActivity::class.java))
        }



        val addedNumbers = viewModel.getFirstMethod(5 ,7)
        var f = addedNumbers

        lifecycleScope.launch {
            viewModel.getAddedNumbers(5 ,6)
            viewModel.getNumbersStateFlow.collect(){
                val result = it.addedNumbers
                var f = result
            }
        }


    }


    fun getTitleFromServer(firstNum: Int, secondNum: Int): Int {

        return firstNum + secondNum

    }

}