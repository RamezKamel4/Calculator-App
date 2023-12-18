package com.example.calculator;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;

public class CalculatorActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAddition() {
        Espresso.onView(ViewMatchers.withId(R.id.button_plus)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_2)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_3)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_equals)).perform(ViewActions.click());
    }

    @Test
    public void testSubtraction() {
        Espresso.onView(ViewMatchers.withId(R.id.button_minus)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_8)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_5)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_equals)).perform(ViewActions.click());
    }

    @Test
    public void testMultiplication() {
        Espresso.onView(ViewMatchers.withId(R.id.button_multiply)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_2)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_6)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_equals)).perform(ViewActions.click());
    }

    @Test
    public void testDivision() {
        Espresso.onView(ViewMatchers.withId(R.id.button_divide)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_1)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_0)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button_equals)).perform(ViewActions.click());
    }

    @Test
    public void testComplexExpression() {
        Espresso.onView(ViewMatchers.withId(R.id.button_5)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_plus)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_3)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_multiply)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_2)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_equals)).perform(ViewActions.click());
    }
}
