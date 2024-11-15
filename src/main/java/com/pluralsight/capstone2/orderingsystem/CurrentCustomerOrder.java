package com.pluralsight.capstone2.orderingsystem;

import com.pluralsight.capstone2.sandwich.SandwichBuilder;
import com.pluralsight.capstone2.sandwich.SandwichIngredients;

public class CurrentCustomerOrder {
    private SandwichBuilder sandwichBuilder = new SandwichBuilder();

    public void placeOrder(int numberOfOrders) {
        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("Making sandwich " + (i + 1));
            SandwichIngredients sandwich = sandwichBuilder.createSandwich();
            sandwichBuilder.addSandwich(sandwich);
            System.out.println("Added: " + sandwich);
        }
        sandwichBuilder.displayOrderSummary();
    }
}