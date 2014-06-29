package com.launchcode.java.basics;

import org.junit.Test;

/**
 * User: mpmenne
 * Date: 6/28/14
 * Time: 12:50 PM
 */
public class ExceptionHandling {

    @Test (expected = Exception.class)
    public void exceptionsCanHaveAFinallyIfTheyThrowTheException() throws Exception {
        try {
            throw new Exception();
        } finally {

        }
    }

    @Test
    public void mustBeTryCatchFinally() {

        //  THIS DOESNT WORK
//        try {
//            throw new Exception();
//        } finally {
//
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }

    }
}