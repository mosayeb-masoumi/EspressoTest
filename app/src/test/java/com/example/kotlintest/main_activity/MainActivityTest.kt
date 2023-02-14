package com.example.kotlintest.main_activity

import com.example.kotlintest.main_activity.MainActivity
import org.junit.Assert.*

import com.google.common.truth.Truth.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest{


    @Test
    fun testGetTitleFromServer() {
        val firstNum = 5
        val secondNum = 10
        val expectedResult = 15

        val result = MainActivity().getTitleFromServer(firstNum, secondNum)

        assertEquals(expectedResult, result)
    }


//    @Test
//    fun getTitleFromServer() {
////        val mainActivity = MainActivity().getTitleFromServer(1,3)
//        val result = MainActivity().getTitleFromServer(1,3)
////        assertEquals(6, result)
//        assertThat(result).isEqualTo(6)
//    }
}