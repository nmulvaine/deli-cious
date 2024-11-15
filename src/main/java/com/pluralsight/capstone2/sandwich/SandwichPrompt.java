package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.MenuItemParser;

import java.util.List;
import java.util.Scanner;

public class SandwichPrompt {
    private final MenuItemParser menuItemParser;
    private final Scanner scanner;

    public SandwichPrompt(MenuItemParser menuItemParser) {
        this.menuItemParser = menuItemParser;
        this.scanner = new Scanner(System.in);
    }

    public void sandwichPrompt(String filePath) {
        // Parse the CSV file
        List<SandwichIngredients> sandwichList = menuItemParser.parseCSV(filePath);

        // Print the menu and collect user input
        System.out.println("Please select the type of bread you'd like:");
        printMenuItems(sandwichList, "bread");
        String breadChoice = scanner.nextLine();

        System.out.println("Please select the type of meat you'd like:");
        printMenuItems(sandwichList, "meat");
        String meatChoice = scanner.nextLine();

        System.out.println("Please select the type of cheese you'd like:");
        printMenuItems(sandwichList, "cheese");
        String cheeseChoice = scanner.nextLine();

        System.out.println("Please select the type of veggies you'd like:");
        printMenuItems(sandwichList, "veggies");
        String veggiesChoice = scanner.nextLine();

        System.out.println("Please select the type of sauces you'd like:");
        printMenuItems(sandwichList, "sauces");
        String saucesChoice = scanner.nextLine();

        System.out.println("Please select the type of drink you'd like:");
        printMenuItems(sandwichList, "drinks");
        String drinksChoice = scanner.nextLine();

        System.out.println("Please select the type of chips you'd like:");
        printMenuItems(sandwichList, "chips");
        String chipsChoice = scanner.nextLine();

        // Print the user's choices
        System.out.println("Your sandwich order:");
        System.out.println("Bread: " + breadChoice);
        System.out.println("Meat: " + meatChoice);
        System.out.println("Cheese: " + cheeseChoice);
        System.out.println("Veggies: " + veggiesChoice);
        System.out.println("Sauces: " + saucesChoice);
        System.out.println("Drink: " + drinksChoice);
        System.out.println("Chips: " + chipsChoice);
    }

    private void printMenuItems(List<SandwichIngredients> sandwichList, String itemType) {
        for (SandwichIngredients menuItem : sandwichList) {
            switch (itemType) {
                case "bread":
                    System.out.println(menuItem.getBread());
                    break;
                case "meat":
                    System.out.println(menuItem.getMeat());
                    break;
                case "cheese":
                    System.out.println(menuItem.getCheese());
                    break;
                case "veggies":
                    System.out.println(menuItem.getVeggies());
                    break;
                case "sauces":
                    System.out.println(menuItem.getSauces());
                    break;
                case "drinks":
                    System.out.println(menuItem.getDrinks());
                    break;
                case "chips":
                    System.out.println(menuItem.getChips());
                    break;
                default:
                    System.out.println("Invalid menu item type.");
            }
        }
    }
}