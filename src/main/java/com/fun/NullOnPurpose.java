package com.fun;

/**
 * This class has a function that is invoked by the main method.
 * The value passed into the function is null, on purpose.
 * This is to demonstrate the helpful NullPointerException messages being evaluated in Java 14. (JEP-358)
 */
public class NullOnPurpose {

    public static void main(String[] args) {
        seeWhatHappensWhenWePassNullIn(null);
    }

    private static void seeWhatHappensWhenWePassNullIn(String value){
        if (!value.isEmpty()) System.out.println("SUCCESS! We have a value!");;
    }
}
