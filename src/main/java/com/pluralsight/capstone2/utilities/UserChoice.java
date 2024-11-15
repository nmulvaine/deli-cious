package com.pluralsight.capstone2.utilities;

import java.util.Scanner;

public class UserChoice {
    private static final Scanner scanner = new Scanner(System.in);

    // Static method to get user input for a given prompt
    public static String getUserChoice(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}