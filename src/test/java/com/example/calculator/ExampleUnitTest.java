package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class MainActivityTest {

    @Test
    public void testAddition() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("2 + 3");
        assertEquals("5", result);
    }

    @Test
    public void testSubtraction() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("8 - 5");
        assertEquals("3", result);
    }

    @Test
    public void testMultiplication() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("2 * 6");
        assertEquals("12", result);
    }

    @Test
    public void testDivision() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("10 / 2");
        assertEquals("5", result);
    }

    @Test
    public void testExpression() {
        MainActivity activity = new MainActivity();
        String result = activity.getResult("2 + 3 * 4");
        assertEquals("14", result);
    }
}
