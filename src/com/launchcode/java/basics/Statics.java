package com.launchcode.java.basics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: mpmenne
 * Date: 6/28/14
 * Time: 12:54 PM
 */
public class Statics {


    // have to be initialized
    public static final int FINAL_INT = 1;

    // doesn't have to be initialized since it's not static
    public static int NOT_FINAL_INT;

    // has to be initialized since final
    public static final Integer FINAL_INTEGER = 1;

    public static Integer NOT_FINAL_INTEGER = 0;

    @Test
    public void finalStaticIntWillBeZero() {
        assertEquals(1, FINAL_INT);
    }

    @Test
    public void staticIntInitializesToZero() {
        assertEquals(0, NOT_FINAL_INT);
    }

    @Test
    public void finalStaticIntegerToOne() {
        Integer i = 1;
        assertEquals(i, FINAL_INTEGER);
    }

    @Test
    public void staticIntegerToZero() {
        // has to be initialized
        Integer i = 0;
        assertEquals(i, NOT_FINAL_INTEGER);
    }

    @Test
    public void intDefaultsToZero() {
        // ints need to be initialized
        int i = 0;
        assertEquals(0, i);
    }

}
