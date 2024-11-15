package com.pluralsight.capstone2.utilities;

import java.util.Scanner;

public class UserChoice {
    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}