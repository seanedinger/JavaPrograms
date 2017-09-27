package com.seanedinger;

public class Main {

    public static void main(String[] args) {
        // width of 16 - 2 bytes
        char myChar = '\u00a9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char regChar = '\u00ae';
        System.out.println("Registered symbol = " + regChar);
    }
}
