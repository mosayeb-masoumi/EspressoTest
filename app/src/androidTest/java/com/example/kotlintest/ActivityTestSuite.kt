package com.example.kotlintest

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(MainActivityUiTest::class,SecondActivityTest::class)
class ActivityTestSuite