package com.launchcode.java.basics;

/**
 * User: mpmenne
 * Date: 6/15/14
 * Time: 12:17 PM
 */
public class JavaCommandLineArguments {

    public static void main(String[] args){
        System.out.println(args[0]);
        if (args[0].equals("open")) {
            if (args[1].equals("someone")) {
                System.out.println("Hello!");
            }
        } else {
            System.out.println("Go away "+ args[1]);
        }
    }

}
