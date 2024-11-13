package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.UserChoice;
import com.pluralsight.capstone2.utilities.UserPrompt;

public class SandwichBuilder<sandwich>
{
    // Want userPrompt with existing values
    UserPrompt userPrompt = new UserPrompt(null);
    UserChoice uc;
    SandwichIngredients si;

    public SandwichBuilder(SandwichIngredients si)
    {
        this.si = si;
    }

    private boolean isMakingSandwich = true;
    protected static int sandwichCounter = 0;


    // Counts number of sandwiches Cx has made
    public void sandwichBuilder()
    {
        sandwichCounter++;
        int numberOfOrders = userPrompt.getNumberOfOrders(sandwichCounter);

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("\nMaking sandwich" + (i + 1));
            buildSandwich();
        }
        System.out.println("\nYou order is done being made");

        protected static void buildSandwich() {

        // add veggiesChoice to a sandwich object
        System.out.println("Your sandwich has: " + bread + ", " + meat + ", " + cheese + ", " + veggies);
    }

    si.BreadType() breadChoice (){
        System.out.println("Please enter bread");
        String bread = userPrompt.getScan().nextLine().trim().toLowerCase();

    }

    }

}
