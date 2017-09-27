package com.seanedinger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double poundsToKilos = 0.45359237d;

	Scanner scan = new Scanner(System.in);
    double numPounds = scan.nextDouble();
    double convertedToKilos = numPounds * poundsToKilos;
        System.out.println(convertedToKilos);
        scan.close();
    }
}
