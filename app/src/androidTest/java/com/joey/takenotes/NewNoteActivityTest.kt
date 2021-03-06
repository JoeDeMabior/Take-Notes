package com.joey.takenotes

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.joey.takenotes.activity.NewNoteActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class NewNoteActivityTest {

    @get:Rule
    var rule = ActivityScenarioRule(NewNoteActivity::class.java)

    @Test
    fun checkViewDisplay() {
        onView(withId(R.id.title)).check(matches(isDisplayed()))
        onView(withId(R.id.body)).check(matches(isDisplayed()))
    }
}
