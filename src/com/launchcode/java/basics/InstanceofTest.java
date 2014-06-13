package com.launchcode.java.basics;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: mpmenne
 * Date: 6/13/14
 * Time: 11:09 AM
 */
public class InstanceofTest {


    @Test
    public void instanceofIsFalseForNull() {
        assertFalse(null instanceof Object);
    }

    @Test
    public void stringsAreObjects() {
        assertTrue("Hello" instanceof Object);
    }

    @Test
    public void objectsAreNotStrings() {
        assertFalse(new Object() instanceof String);
    }

    @Test
    public void compareTwoObjects() {
        // will not compile
        // assertFalse(new Object() instanceof new Object().getClass());
    }


}
