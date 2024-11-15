package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.sandwich.*;
import java.util.ArrayList;
import java.util.List;

public class UserPrompt {
    private UserChoice u = new UserChoice();
    private int numberOfOrders;

    public void userOrderNumberPrompt() {
        System.out.println("Please enter '1' for a single order or '2' for multiple orders");
        String r = u.getScanner().nextLine().trim().toLowerCase();

        switch (r) {
            case "1":
                System.out.println("Alright. Let's begin making your order");
                numberOfOrders = 1;
                break;
            case "2":
                System.out.println("How many orders would you like to make?");
                numberOfOrders = u.getScanner().nextInt();
                System.out.println("You would like to place " + numberOfOrders + " orders? [1 for 'yes'] [2 for 'no']");
                int orderConfirmation = u.getScanner().nextInt();
                if (orderConfirmation == 2) {
                    System.out.println("Let's confirm if you want multiple orders");
                }
                break;
            default:
                System.out.println("I am sorry, I don't understand. Please try again");
                break;
        }
    }

    public int getNumberOfOrders()
    {
        return numberOfOrders;
    }
}