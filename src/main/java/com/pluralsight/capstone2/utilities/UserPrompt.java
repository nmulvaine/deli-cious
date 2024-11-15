package com.pluralsight.capstone2.utilities;


import com.pluralsight.capstone2.orderingsystem.CurrentCustomerOrder;
import com.pluralsight.capstone2.sandwich.SandwichBuilder;

public class UserPrompt extends UserChoice<Object>
{
    SandwichBuilder sb;
    private int numberOfOrders;

    // Raw data type for input
    public UserPrompt(Object choice)
    {
        super(choice);

    }

    public void userOrderNumberPrompt()
    {
        System.out.println("""
                Please enter '1' for a single order or '2' for multiple orders
                
                """);
        // Gets yes or no to multiple orders
        String r = getScan().nextLine().trim().toLowerCase();
        UserChoice<String> userChoice = new UserChoice<>(r);

        while (!userChoice.getChoice().equals("2") && !userChoice.getChoice().equals("1")) {
            r = getScan().nextLine().trim().toLowerCase();
            userChoice.setChoice(r);
        }

        if (userChoice.getChoice().equals("2")) {
            System.out.println("How many orders would you like to make?");
            numberOfOrders = getScan().nextInt();
            System.out.println("You would like to place " + numberOfOrders + " orders?");
            System.out.println("Yes or no?");
            userChoice.setChoice(r);
            if (userChoice.getChoice().equals("no")) {
                return;
            }

        } else if (userChoice.getChoice().equals("1")) {
            System.out.println("Alright. Let's begin making your order.");
            numberOfOrders = 1;

        } else {
            System.out.println("I am sorry, I don't understand. Please try again");
        }


        CurrentCustomerOrder order = new CurrentCustomerOrder();

        order.placeOrder(numberOfOrders);
        sb.setSandwichesInOrder();
    }

    public void setNumberOfOrders(int numberOfOrders)
    {
        this.numberOfOrders = numberOfOrders;
    }

    public int getNumberOfOrders()
    {
        return numberOfOrders;
    }
}