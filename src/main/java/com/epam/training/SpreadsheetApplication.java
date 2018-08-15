package com.epam.training;

import com.epam.training.expression.ExpressionParser;

import java.util.Scanner;

public class SpreadsheetApplication {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to SpreadsheetApplication!");
        String input = sc.nextLine();
        ExpressionParser.parse(input);










    }
}
