package org.application.logintest.application.androidespressotest;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.application.logintest.application.androidespressotest.MainActivityTest2.childAtPosition;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private String mEmail;
    private String mPassword;
    private String mSuccessString;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initVariables() {

        mEmail = "raj.amalw@gmail.com";

        mPassword = "12345";

        mSuccessString = "User Registered Successfully !";

    }

    @Test
    public void MainActivityTest() {

        onView(withId(R.id.et_email)).perform(typeText(mEmail));

        closeSoftKeyboard();

        onView(withId(R.id.et_password)).perform(typeText(mPassword));

        closeSoftKeyboard();

        //onView(withId(R.id.btn_login)).perform(click());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_login), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.contentContainer),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.et_first_name),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText4.perform(typeText("Mr Bounlerth"), ViewActions.closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.et_last_name),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText5.perform(typeText("Saixondeth"), ViewActions.closeSoftKeyboard());


    }
}
