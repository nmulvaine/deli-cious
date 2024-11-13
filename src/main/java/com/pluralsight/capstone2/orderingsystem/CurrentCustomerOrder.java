package com.pluralsight.capstone2.orderingsystem;

import com.pluralsight.capstone2.sandwich.SandwichBuilder;
import com.pluralsight.capstone2.utilities.UserPrompt;

import java.util.ArrayList;

import static com.pluralsight.capstone2.sandwich.SandwichBuilder.*;

public class CurrentCustomerOrder
{

    static UserPrompt p = new UserPrompt(null);
    ArrayList<Sandwich> sandwichList = new ArrayList<>();

    public void currentCustomerSandwich()
    {
        p.userOrderNumberPrompt();
        int numberOfOrders = p.getNumberOfOrders();

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("Making sandwich " + (i + 1));
            Sandwich sandwich = createSandwich();
            sandwichList.add(sandwich);
            System.out.println("Added:" + sandwich);
        }
        displayOrderSummary();

    }
private void displayOrderSummary() {
    System.out.println("\nOrder Summary");
    for (Sandwich sandwich : sandwichList) {
        System.out.println("Choose bread type:");
        String bread = scan.nextLine().trim();

        System.out.println("Choose meat type:");
        String meat = scan.nextLine().trim();

        System.out.println("Choose cheese type:");
        String cheese = scan.nextLine().trim();

        System.out.println("Choose veggies:");
        String veggies = scan.nextLine().trim();

        return new Sandwich(bread, meat, cheese, veggies);
    }
}
    }





