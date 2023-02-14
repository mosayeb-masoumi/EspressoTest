package com.example.kotlintest

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.kotlintest.main_activity.MainActivity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    //this variable will global for all fun that will be create
    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    //first check activity is visible to user
    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.mainactivity_root))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkButtonVisibility(){
        onView(withId(R.id.btn_main))
            .check(matches(isDisplayed()))
    }

    //check if text in our view is the right one
    @Test
    fun testTextIsMainActivity(){
        onView(withId(R.id.txt))
            .check(matches(withText(R.string.main_text)))
    }

    //testing click button in main activity , if after a click we will navigate to second Activity
    // and test if our view(Second Activity) will be displayed
    @Test
    fun navigateToSecondActivity(){
        onView(withId(R.id.btn_main))
            .perform(click())

        //with click everything is alright
        // now we will check our secondActivity is visible to the user
        onView(withId(R.id.secondActivity_root))
            .check(matches(isDisplayed()))
    }

    //test backPress to main activity
    @Test
    fun BackPressFromSecondActivityToMainActivity(){
        //click on button in mainactivity
        onView(withId(R.id.btn_main))
            .perform(click())

        // secondActivity will be visible
        onView(withId(R.id.secondActivity_root))
            .check(matches(isDisplayed()))


        // here we will check onBackPress
        // when the user is on the second activity
        Espresso.pressBack()


        // after cleck on backButton in SecondActivity we will check main activity is displayed

        onView(withId(R.id.mainactivity_root))
            .check(matches(isDisplayed()))
    }
}