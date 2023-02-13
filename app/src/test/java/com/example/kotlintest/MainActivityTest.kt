package com.example.kotlintest

//import org.junit.Assert.*

import com.google.common.truth.Truth.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest{



    @Test
    fun getTitleFromServer_correctSum() {
        val mainActivity = MainActivity()
        val result = mainActivity.getTitleFromServer(1, 5)
//        assertEquals(6, result)
        assertThat(result).isEqualTo(6)
    }
}