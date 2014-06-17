package com.launchcode.java.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by root on 6/16/14.
 */
public class PlusPlus {
    @Test
    public void incrementAfter(){
        int i = 1;
        assertEquals(1,i++);
        assertEquals(2,i);
    }
    @Test
    public void incrementBefore() {
        int i = 1;
        assertEquals(2,++i);

    }

}
