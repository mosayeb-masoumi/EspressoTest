package com.example.kotlintest

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class SecondActivityTest{
    //this variable will global for all fun that will be create
    @get:Rule
    var activityScenarioRule = activityScenarioRule<SecondActivity>()

    //first check activity is visible to user
    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.secondActivity_root))
            .check(matches(isDisplayed()))
    }


    //first check activity is visible to user
    @Test
    fun checkButtonVisibility(){
        onView(withId(R.id.btn_back_pressed))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkBtnClickBackPress(){

        onView(withId(R.id.btn_back_pressed))
            .check(matches(isDisplayed()))

        onView(withId(R.id.btn_back_pressed))
            .perform(click())

    }

}