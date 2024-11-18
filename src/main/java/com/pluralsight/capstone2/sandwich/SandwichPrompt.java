package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.ReceiptWriter;
import com.pluralsight.capstone2.utilities.MenuItemParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichPrompt {
    private final MenuItemParser menuItemParser;
    private final Scanner scanner;
    private final List<SandwichIngredients> sandwiches = new ArrayList<>();

    public SandwichPrompt(MenuItemParser menuItemParser) {
        this.menuItemParser = menuItemParser;
        this.scanner = new Scanner(System.in);
        menuItemParser.parseCSV();
    }

    public void sandwichPrompt() {
        boolean ordering = true;

        while (ordering) {
            System.out.println("Please select the type of bread you'd like (enter 0 to skip):");
            String breadChoice = getUserChoice(menuItemParser.getBreadList());

            System.out.println("Please select the type of meat you'd like (enter 0 to skip):");
            String meatChoice = getUserChoice(menuItemParser.getMeatList());

            System.out.println("Please select the type of cheese you'd like (enter 0 to skip):");
            String cheeseChoice = getUserChoice(menuItemParser.getCheeseList());

            System.out.println("Please select the type of veggies you'd like (enter 0 to skip):");
            String veggiesChoice = getUserChoice(menuItemParser.getVeggiesList());

            System.out.println("Please select the type of sauces you'd like (enter 0 to skip):");
            String saucesChoice = getUserChoice(menuItemParser.getSaucesList());

            System.out.println("Please select the type of drink you'd like (enter 0 to skip):");
            String drinksChoice = getUserChoice(menuItemParser.getDrinksList());

            System.out.println("Please select the type of chips you'd like (enter 0 to skip):");
            String chipsChoice = getUserChoice(menuItemParser.getChipsList());

            SandwichIngredients sandwich = new SandwichIngredients(
                    breadChoice, meatChoice, cheeseChoice, veggiesChoice
            );
            sandwich.setSauces(saucesChoice);
            sandwich.setDrinks(drinksChoice);
            sandwich.setChips(chipsChoice);
            sandwiches.add(sandwich);

            System.out.println("Would you like to add another sandwich? (yes/no)");
            String anotherSandwich = scanner.nextLine().trim().toLowerCase();
            if (!anotherSandwich.equals("yes")) {
                ordering = false;
            }
        }
        checkout();
    }

    private String getUserChoice(List<String> options) {
        int index = 1;
        for (String option : options) {
            System.out.println(index + ". " + option);
            index++;
        }
        System.out.println("0. Skip");

        int choice = -1;
        while (choice < 0 || choice > options.size()) {
            System.out.print("Enter your choice (0-" + options.size() + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 0 || choice > options.size()) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        scanner.nextLine();

        return choice == 0 ? "" : options.get(choice - 1);
    }

    private void checkout() {
        System.out.println("Enter your name for the receipt:");
        String customerName = scanner.nextLine().trim();

        double totalAmount = calculateTotalAmount();

        ReceiptWriter.Receipt receipt = new ReceiptWriter.Receipt();
        receipt.generateReceipt(customerName, sandwiches, totalAmount);

        System.out.println("Thank you for your order! Your receipt has been printed.");
    }

    private double calculateTotalAmount(price) {
        // TODO add parsed to calculate total amount
        price =
        return sandwiches.size() * 10.0;
    }
}