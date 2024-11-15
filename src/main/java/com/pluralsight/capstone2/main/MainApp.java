package com.pluralsight.capstone2.main;

import com.pluralsight.capstone2.utilities.*;
import com.pluralsight.capstone2.orderingsystem.CurrentCustomerOrder;
import com.pluralsight.capstone2.sandwich.SandwichPrompt;

public class MainApp {
    public static void main(String[] args) {
        boolean running = true;
        UserChoice userChoice = new UserChoice();
        UserPrompt userPrompt = new UserPrompt();
        CurrentCustomerOrder currentCustomerOrder = new CurrentCustomerOrder();
        MenuItemParser menuItemParser = new MenuItemParser();
        SandwichPrompt sandwichPrompt = new SandwichPrompt(menuItemParser);

        while (running) {
            displayMenu();
            String input = userChoice.getScanner().nextLine().trim().toLowerCase();
            switch (input) {
                case "1":
                    userPrompt.userOrderNumberPrompt();
                    currentCustomerOrder.placeOrder(userPrompt.getNumberOfOrders());
                    sandwichPrompt.sandwichPrompt();
                    break;
                case "2":
                    System.out.println("Thank you! Goodbye.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nWelcome to the Sandwich Ordering System");
        System.out.println("1. Place a new order");
        System.out.println("2. Exit");
        System.out.print("Please enter your choice: ");
    }
}