package com.pluralsight.capstone2.utilities;


import com.pluralsight.capstone2.orderingsystem.CurrentCustomerOrder;

public class UserPrompt extends UserChoice<Object>
{
    private int numberOfOrders;

    // Raw data type for input
    public UserPrompt(Object choice)
    {
        super(choice);

    }
    public void userOrderNumberPrompt()
    {
        System.out.println("""
                Please enter 'one' for a single order
                
                or 'multiple' for multiple orders
                
                """);
        // Gets yes or no to multiple orders
        String r = getScan().nextLine().trim().toLowerCase();
        UserChoice<String> userChoice = new UserChoice<>(r);

        while (!userChoice.getChoice().equals("multiple") && !userChoice.getChoice().equals("one")) {
            r = getScan().nextLine().trim().toLowerCase();
            userChoice.setChoice(r);
        }

        if (userChoice.getChoice().equals("multiple")) {
            System.out.println("How many orders would you like to make?");
            numberOfOrders = getScan().nextInt();
            System.out.println("You would like to place " + numberOfOrders + " orders?");
        } else if (userChoice.getChoice().equals("one")) {
            System.out.println("Alright. Let's begin making your order.");
            numberOfOrders = 1;

        } else {
            System.out.println("I am sorry, I don't understand. Please try again");
        }


        CurrentCustomerOrder order = new CurrentCustomerOrder();
        order.placeOrder(numberOfOrders);
    }


    public int getNumberOfOrders()
    {
        return numberOfOrders;
    }
}