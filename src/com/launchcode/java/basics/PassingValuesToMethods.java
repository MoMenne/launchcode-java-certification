package com.launchcode.java.basics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: mpmenne
 * Date: 6/28/14
 * Time: 1:10 PM
 */
public class PassingValuesToMethods {

    @Test
    public void intsAreNOTNOTChangedWhenPassedIntoMethods() {
        int i = 1;
        changeToFive(5);
        assertEquals(1, i);
    }

    private static int changeToFive(int i) {
        i = 5;
        return i;
    }

    @Test
    public void integersAreNOTNOTChangedWhenPassedIntoMethods() {
        Integer i = 1;
        changeIntegerToFive(i);
        assertEquals(new Integer(1), i);
    }

    private static Integer changeIntegerToFive(Integer i) {
        i = 5;
        return i;
    }



}
