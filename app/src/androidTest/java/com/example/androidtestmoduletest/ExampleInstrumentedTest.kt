package com.example.androidtestmoduletest

import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule

import org.junit.Test
import org.junit.Rule

class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun showsHelloWorld() {
        onView(withId(R.id.hello_world)).check(matches(withText("Hello World!")))
    }
}
