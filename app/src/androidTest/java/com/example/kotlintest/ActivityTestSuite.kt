package com.example.kotlintest

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@RunWith(Suite::class)
@Suite.SuiteClasses(MainActivityTest::class,SecondActivityTest::class)
class ActivityTestSuite