package com.techelevator;

import java.util.Scanner;

public class KilometerConverter {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a kilometer value to start at: ");
        String userValue = input.nextLine();
        int kilometerStart = Integer.parseInt(userValue);

        System.out.println("Enter a kilometer value to end with: ");
        String userEndValue = input.nextLine();
        int kilometerEnd = Integer.parseInt(userEndValue);

        System.out.println("How many should it increment by: ");
        String incrementValue = input.nextLine();
        int kilometerIncrement = Integer.parseInt(incrementValue);

        System.out.println("Going from " + kilometerStart + "km to " + kilometerEnd + "km in increments of " + kilometerIncrement + "km.");

        for (int km = kilometerStart; km <= kilometerEnd; km += kilometerIncrement) {
            double miles = kilometersToMiles(km);
            System.out.println(km + "km is " + miles + "mi. ");
        }
    }
    public static double kilometersToMiles(int kilometers) {
        final double MILES_PER_KILOMETER = 0.621371;
        return kilometers * MILES_PER_KILOMETER;
    }


    
}
