package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.UserChoice;
import com.pluralsight.capstone2.utilities.UserPrompt;

public class SandwichBuilder
{
    // Want userPrompt with existing values
    UserPrompt userPrompt = new UserPrompt(null);
    UserChoice uc;


    private boolean isMakingSandwich = true;
    protected static int sandwichCounter;


    // Counts number of sandwiches Cx has made
    public void sandwichBuilder()
    {
        sandwichCounter++;
        userPrompt.getNumberOfOrders(sandwichCounter);

        while (isMakingSandwich) {
            System.out.println("Select bread type: ");

        }

    }

}
