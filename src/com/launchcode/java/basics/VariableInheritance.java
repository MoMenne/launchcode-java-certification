package com.launchcode.java.basics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: mpmenne
 * Date: 6/13/14
 * Time: 11:21 AM
 */

class ABCD{
   int x = 10;
   static int y = 20;
}
class MNOP extends ABCD{
   int x = 30;
   static int y = 40;
}

public class VariableInheritance {

    @Test
    public void staticsShouldInherit() {
        System.out.println(new MNOP().x+", "+new MNOP().y);

        assertEquals(40, new MNOP().y);
    }

    @Test
    public void normalVariablesShouldInheritAsWell() {
       System.out.println(new MNOP().x+", "+new MNOP().y);

        assertEquals(30, new MNOP().x);
    }

}
