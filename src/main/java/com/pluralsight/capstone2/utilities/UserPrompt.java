package com.pluralsight.capstone2.utilities;


import com.pluralsight.capstone2.sandwich.SandwichBuilder;



public class UserPrompt extends UserChoice<Object>
{
    int numberOfOrders;
    SandwichBuilder sb = new SandwichBuilder();

    // Raw data type for input
    public UserPrompt(Object choice)
    {
        super(choice);
        this.choice = choice;

    }


    public void userOrderNumberPrompt()
    {
        System.out.println("""
                Welcome! Let's get started with your order!
                
                Is this one order or multiple?
                
                """);
        // Gets yes or no to multiple orders
        String r = scan.nextLine().trim().toLowerCase();
        UserChoice<String> userChoice = new UserChoice<>(r);

        while (!userChoice.getChoice().equals("multiple") && !userChoice.getChoice().equals("one")) {
            r = scan.nextLine().trim().toLowerCase();
            userChoice.setChoice(r);
        }

        if (userChoice.getChoice().equals("multiple")) {
            System.out.println("How many orders would you like to make?");
            numberOfOrders = scan.nextInt();
            System.out.println("You would like to place " + numberOfOrders + " orders?");
            collectSandwichOrder();
        } else if (userChoice.getChoice().equals("one")) {
            System.out.println("Alright. Let's begin making your order.");
            numberOfOrders = 1;
            collectSandwichOrder();
        } else {
            System.out.println("I am sorry, I don't understand. Please try again");
        }
    }

    private void collectSandwichOrder()
    {
        for (int i = 1; i <= numberOfOrders; i++) {
            System.out.println("Let's start getting your items together for order " + 1 + ":");
            sb.sandwichBuilder();
        }
    }

    public int getNumberOfOrders(int sandwichCounter)
    {
        return numberOfOrders;
    }

}

