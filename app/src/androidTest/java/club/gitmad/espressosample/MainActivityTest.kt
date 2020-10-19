package club.gitmad.espressosample


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    private lateinit var testString: String

    @get:Rule
    var activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun initData() {
        testString = "someName"
    }

    @Test
    fun helloNameTest() {
        onView(withId(R.id.etName)).perform(replaceText(testString))
        onView(withId(R.id.btnHello)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("Hello, $testString!")))
    }
}
