package com.epam.training;

import com.epam.training.spreadsheet.Table;

import java.util.Scanner;

public class SpreadsheetApplication {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Table t = new Table();
        System.out.println(t);
    }
}
