package com.pluralsight.capstone2.main;

import com.pluralsight.capstone2.utilities.UserChoice;
import com.pluralsight.capstone2.utilities.UserPrompt;

public class MainApp
{
    static UserPrompt p = new UserPrompt(null);

    private static boolean orderInProgress;

    public static void main(String[] args)
    {
        System.out.print("""
                Welcome! Please select a menu option:
                
                1: New Order
                
                2: Exit
                
                """);
        UserChoice<String> u = new UserChoice<>(null);
        String r = u.getScan().nextLine().trim().toLowerCase();
        u.setChoice(r);


        if (u.getChoice().equals("1")) {
            p.userOrderNumberPrompt();
           orderInProgress = true;
            System.out.println("Was unable to run userOrderNumberPrompt");
            // Start order system
        } else if (u.getChoice().equals("2")) {
            // Exit
            System.out.println();
        } else {
            System.out.println("I am sorry, I didn't understand'");
        }
    }


    public boolean getOrderInProgress()
    {
        return orderInProgress;
    }
}
