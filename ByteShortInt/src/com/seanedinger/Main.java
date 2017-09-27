package com.seanedinger;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myIntValue = 31;

        // byte has a width of 8
        byte myByteValue = 4;

        // short has a width of 16
        short myShortValue = 128;

        // long has a width of 64
        long myLongValue = 50000 + 10 * (myByteValue + myShortValue + myIntValue);

        System.out.println(myLongValue);
    }
}
