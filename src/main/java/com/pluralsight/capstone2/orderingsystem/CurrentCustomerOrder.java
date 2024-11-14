package com.pluralsight.capstone2.orderingsystem;

import com.pluralsight.capstone2.sandwich.SandwichIngredients;
import com.pluralsight.capstone2.utilities.UserChoice;


import java.util.ArrayList;


public class CurrentCustomerOrder
{
   protected ArrayList<SandwichIngredients> sandwichList = new ArrayList<>();



    public void placeOrder(int numberOfOrders)
    {
        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("Making sandwich " + (i + 1));
            SandwichIngredients sandwich = createSandwich();
            sandwichList.add(sandwich);
            System.out.println("Added:" + sandwich);
        }
        displayOrderSummary();

    }

    private SandwichIngredients createSandwich()
    {
        UserChoice<String> userChoice = new UserChoice<>("");
        System.out.println("Choose bread type:");
        String bread = userChoice.getScan().nextLine().trim();

        System.out.println("Choose meat type:");
        String meat = userChoice.getScan().nextLine().trim();

        System.out.println("Choose cheese type:");
        String cheese = userChoice.getScan().nextLine().trim();

        System.out.println("Choose veggies:");
        String veggies = userChoice.getScan().nextLine().trim();

        return new SandwichIngredients(bread, meat, cheese, veggies);
    }

    private void displayOrderSummary()
    {
        System.out.println("\nOrder Summary");
        for (SandwichIngredients sandwich : sandwichList) {
            System.out.println(sandwich);
        }
    }
}