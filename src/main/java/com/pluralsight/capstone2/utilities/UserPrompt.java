package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.orderingsystem.CurrentCustomerOrder;
import com.pluralsight.capstone2.sandwich.SandwichBuilder;
import com.pluralsight.capstone2.sandwich.SandwichIngredients;

public class UserPrompt extends UserChoice<String>
{
    private final SandwichBuilder sb;
    private int numberOfOrders;

    public UserPrompt()
    {
        super(null);
        sb = new SandwichBuilder();
    }

    public void userOrderNumberPrompt()
    {
        System.out.println("Please enter '1' for a single order or '2' for multiple orders");
        String r = getScan().nextLine().trim().toLowerCase();
        setChoice(r);

        while (!getChoice().equals("2") && !getChoice().equals("1")) {
            r = getScan().nextLine().trim().toLowerCase();
            setChoice(r);
        }

        switch (getChoice()) {
            case "1":
                System.out.println("Alright. Let's begin making your order");
                numberOfOrders = 1;
                break;
            case "2":
                System.out.println("How many orders would you like to make?");
                numberOfOrders = getScan().nextInt();
                System.out.println("You would like to place " + numberOfOrders + " orders? [1 for 'yes'] [2 for 'no']");
                int orderConfirmation = getScan().nextInt();
                if (orderConfirmation == 2) {
                    System.out.println("Let's confirm if you want multiple orders");
                }
                break;
            default:
                System.out.println("I am sorry, I don't understand. Please try again");
                break;
        }

        CurrentCustomerOrder order = new CurrentCustomerOrder();
        order.placeOrder(numberOfOrders);

        // Create sandwiches and add them to the order
        for (int i = 0; i < numberOfOrders; i++) {
            SandwichIngredients sandwich = sb.createSandwich();
            sb.addSandwich(sandwich);
        }

        // Set the sandwiches in the order
        sb.setSandwichesInOrder(sb.getSandwichList());
    }
}
