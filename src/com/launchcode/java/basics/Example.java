package com.launchcode.java.basics;

/**
 * User: mpmenne
 * Date: 6/15/14
 * Time: 11:06 PM
 */
public class Example {

        static int a;
        int b;
        public Example(){
            int c;
            c = a;
            a++;
            b += c;
        }
        public static void main(String args[]) {
            int k = 1;
            k += 3 + ++k;
            System.out.println(k);
        }

}
