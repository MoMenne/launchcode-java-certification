package com.launchcode.java.basics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: mpmenne
 * Date: 6/28/14
 * Time: 12:38 PM
 */
public class OrderOfOperations {

    @Test
    public void multiplicationTakesPrecedenceOverDivision() {
        assertEquals(1, 2 * 2 /4);
    }

    @Test
    public void multiplicationTakesPrecedenceOverAddition() {
        assertEquals(5, 2 * 2 + 1);
    }

    @Test
    public void multiplicationTakesPrecedenceOverSubtraction() {
        assertEquals(3, 2 * 2 -1);
    }

    @Test
    public void divisionTakesPrecedenceOverSubtraction() {
        assertEquals(2, 6 / 2 - 1);
    }

    @Test
    public void additionTakesPrecedenceOverSubtraction() {
        assertEquals(3, 2 + 2 - 1);
    }

    @Test
    public void dotTakesPrecedence() {
        assertEquals("a4HELLO", "a" + 4 + "hello".toUpperCase());
    }
}
