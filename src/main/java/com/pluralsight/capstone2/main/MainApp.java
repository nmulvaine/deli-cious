package com.pluralsight.capstone2.main;

import com.pluralsight.capstone2.utilities.UserChoice;
import com.pluralsight.capstone2.utilities.UserPrompt;


public class MainApp
{
    public static void main(String[] args)
    {
        System.out.println("""
                Welcome! Please enter a menu option:
                
                1: New Order
                
                2: Exit
                
                """);

        UserChoice<String> u = new UserChoice<>(null);
        String r = u.getScan().nextLine().trim().toLowerCase();
        u.setChoice(r);

        if (u.getChoice().equals("1")) {
            UserPrompt p = new UserPrompt(null);
            p.userOrderNumberPrompt();
            System.out.println("Was unable to run userOrderNumberPrompt");
            // Start order system
        } else if (u.getChoice().equals("2")) {
            // Exit
            System.out.println("Thank you. Exiting now");
        } else {
            System.out.println("I am sorry, I didn't understand'");
        }
    }


}



