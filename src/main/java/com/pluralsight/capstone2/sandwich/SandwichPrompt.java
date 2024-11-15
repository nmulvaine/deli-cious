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
        String breadChoice = getUserChoice(sandwichList, "bread");

        System.out.println("Please select the type of meat you'd like:");
        String meatChoice = getUserChoice(sandwichList, "meat");

        System.out.println("Please select the type of cheese you'd like:");
        String cheeseChoice = getUserChoice(sandwichList, "cheese");

        System.out.println("Please select the type of veggies you'd like:");
        String veggiesChoice = getUserChoice(sandwichList, "veggies");

        System.out.println("Please select the type of sauces you'd like:");
        String saucesChoice = getUserChoice(sandwichList, "sauces");

        System.out.println("Please select the type of drink you'd like:");
        String drinksChoice = getUserChoice(sandwichList, "drinks");

        System.out.println("Please select the type of chips you'd like:");
        String chipsChoice = getUserChoice(sandwichList, "chips");

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

    private String getUserChoice(List<SandwichIngredients> sandwichList, String itemType) {
        int index = 1;
        for (SandwichIngredients menuItem : sandwichList) {
            switch (itemType) {
                case "bread":
                    System.out.println(index + ". " + menuItem.getBread());
                    break;
                case "meat":
                    System.out.println(index + ". " + menuItem.getMeat());
                    break;
                case "cheese":
                    System.out.println(index + ". " + menuItem.getCheese());
                    break;
                case "veggies":
                    System.out.println(index + ". " + menuItem.getVeggies());
                    break;
                case "sauces":
                    System.out.println(index + ". " + menuItem.getSauces());
                    break;
                case "drinks":
                    System.out.println(index + ". " + menuItem.getDrinks());
                    break;
                case "chips":
                    System.out.println(index + ". " + menuItem.getChips());
                    break;
                default:
                    System.out.println("Invalid menu item type.");
            }
            index++;
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        switch (itemType) {
            case "bread":
                return sandwichList.get(choice - 1).getBread();
            case "meat":
                return sandwichList.get(choice - 1).getMeat();
            case "cheese":
                return sandwichList.get(choice - 1).getCheese();
            case "veggies":
                return sandwichList.get(choice - 1).getVeggies();
            case "sauces":
                return sandwichList.get(choice - 1).getSauces();
            case "drinks":
                return sandwichList.get(choice - 1).getDrinks();
            case "chips":
                return sandwichList.get(choice - 1).getChips();
            default:
                return "Invalid choice";
        }
    }
}