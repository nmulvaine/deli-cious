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

        UserChoice<String> userChoice = new UserChoice<>(null);

        while (true) {
            String input = userChoice.getScan().nextLine().trim().toLowerCase();
            userChoice.setChoice(input);

            switch (userChoice.getChoice()) {
                case "1":
                    UserPrompt p = new UserPrompt(null);
                    p.userOrderNumberPrompt();
                    System.out.println("Was unable to run userOrderNumberPrompt");
                    // Start order system
                    break;
                case "2":
                    System.out.println("Thank you. Exiting now");
                    break;
                default:
                    System.out.println("I am sorry, I didn't understand");
                    break;
            }

            if (userChoice.getChoice().equals("2")) {
                break;
            }
        }

    }
}