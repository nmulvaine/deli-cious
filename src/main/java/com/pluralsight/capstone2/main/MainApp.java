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

        UserChoice userChoice = new UserChoice();

        while (true) {
            String input = userChoice.getScan().nextLine().trim().toLowerCase();
            userChoice.setChoice(input);

            switch (userChoice.getChoice()) {
                case "1":
                    UserPrompt p = new UserPrompt();
                    p.userOrderNumberPrompt();
                    break;
                case "2":
                    System.out.println("Exiting now");
                    System.exit(0);
                    break;
                default:
                    System.out.println("I am sorry, I didn't understand");
                    break;
            }
        }
    }
}