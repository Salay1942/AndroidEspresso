package org.application.logintest.application.androidespressotest;


import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {

    private String mFirstName;
    private String mLastName;
    private String mAddress;
    private String mSuccessString;

    @Rule
    public ActivityTestRule<SecondActivity> secondActivityActivityTestRule = new ActivityTestRule<>(SecondActivity.class);

    @Before
    public void initVariables(){

        mFirstName = "Mr Bounlerth";

        mLastName = "Saixongdeth";

        mAddress = "Chomphet";

        mSuccessString = "User Registered Successfully !";

    }
    @Test
    public void SecondActivityTest() {

        Intent intent = new Intent();

        intent.putExtra("EXTRA", "Test");

        secondActivityActivityTestRule.launchActivity(intent);

        onView(withId(R.id.et_first_name)).check(matches(withText("Test")));
    }

    @Test
    public void Test1() {

        onView(withId(R.id.et_first_name)).perform(typeText(mFirstName));

        closeSoftKeyboard();

        onView(withId(R.id.et_last_name)).perform(typeText(mLastName));

        closeSoftKeyboard();

        onView(withId(R.id.et_address)).perform(typeText(mAddress));

        closeSoftKeyboard();

        onView(withId(R.id.btn_chg_password)).perform(click());

        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(mSuccessString))).check(matches(isDisplayed()));

    }
}
