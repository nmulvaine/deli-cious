package com.pluralsight.capstone2.orderingsystem;

import com.pluralsight.capstone2.utilities.UserChoice;


import java.util.ArrayList;


public class CurrentCustomerOrder
{
   protected ArrayList<Sandwich> sandwichList = new ArrayList<>();



    public <Sandwich> void placeOrder(int numberOfOrders)
    {
        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("Making sandwich " + (i + 1));
            Sandwich sandwich = createSandwich();
            sandwichList.add(sandwich);
            System.out.println("Added:" + sandwich);
        }
        displayOrderSummary();

    }

    public CurrentCustomerOrder()
    {
        UserChoice userChoice = new UserChoice("");
        System.out.println("Choose bread type:");
        String bread = userChoice.setChoice(new choice);

        System.out.println("Choose meat type:");
        String meat = scan.nextLine().trim();

        System.out.println("Choose cheese type:");
        String cheese = scan.nextLine().trim();

        System.out.println("Choose veggies:");
        String veggies = scan.nextLine().trim();

        return new Sandwich(bread, meat, cheese, veggies);
    }

    private void displayOrderSummary()
    {
        System.out.println("\nOrder Summary");
        for (Sandwich sandwich : sandwichList) {
            System.out.println(sandwich);
        }
    }
}






