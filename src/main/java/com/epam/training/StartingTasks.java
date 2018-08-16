package com.epam.training;

import java.util.Scanner;

public class StartingTasks {

    /**
     * Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
     */
    static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    /**
     * Write a Java program to convert minutes into a number of years and days.
     */
    public static String convertMinutesToYearsAndDays(int minutes) {
        return "3456789 minutes is approximately 6 years and 210 days"; //TODO: solve the task
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }

}
