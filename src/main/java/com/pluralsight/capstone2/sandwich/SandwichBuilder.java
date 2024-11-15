package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.UserChoice;
import java.util.ArrayList;
import java.util.List;

public class SandwichBuilder {
    private final List<SandwichIngredients> sandwichList = new ArrayList<>();

    public void addSandwich(SandwichIngredients sandwich) {
        sandwichList.add(sandwich);
    }

    public List<SandwichIngredients> getSandwichList() {
        return sandwichList;
    }

    public SandwichIngredients createSandwich() {
        UserChoice u = new UserChoice();
        String bread = u.getStringInput("Please select your bread:");
        String meat = u.getStringInput("Please select your meat:");
        String cheese = u.getStringInput("Please select your cheese:");
        String veggies = u.getStringInput("Please select your veggies:");
        SandwichIngredients sandwich = new SandwichIngredients(bread, meat, cheese, veggies);
        addSandwich(sandwich);
        return sandwich;
    }

    public void displayOrderSummary() {
        if (sandwichList.isEmpty()) {
            System.out.println("No sandwiches in the order.");
            return;
        }
        System.out.println("\nOrder Summary:");
        int sandwichNumber = 1;
        for (SandwichIngredients sandwich : sandwichList) {
            System.out.println("Sandwich " + sandwichNumber + ":");
            System.out.println(" - Bread: " + sandwich.getBread());
            System.out.println(" - Meat: " + sandwich.getMeat());
            System.out.println(" - Cheese: " + sandwich.getCheese());
            System.out.println(" - Veggies: " + sandwich.getVeggies());
            sandwichNumber++;
        }
    }
}