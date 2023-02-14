package com.example.kotlintest.main_activity

//import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import com.google.common.truth.Truth.assertThat

@RunWith(JUnit4::class)
class MainViewModelTest{

    @Test
    fun testAddedNumbers(){
        val  firstNumber = 5
        val secondNumber = 5
        val result = MainViewModel().getFirstMethod(firstNumber , secondNumber)
        assertThat(result).isEqualTo(10)
    }
}