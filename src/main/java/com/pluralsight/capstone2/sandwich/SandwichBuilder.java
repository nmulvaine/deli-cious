package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.UserPrompt;

public class SandwichBuilder<sandwich>
{
    // Want userPrompt with existing values
    UserPrompt userPrompt = new UserPrompt(null);
    private SandwichIngredients si;
    private boolean isMakingSandwich = true;
    protected static int sandwichCounter = 0;

    public SandwichBuilder(SandwichIngredients si)
    {
        this.si = si;
    }

    // Counts number of sandwiches Cx has made
    // Makes sandwiches
    public void sandwichBuilder()
    {
        sandwichCounter++;
        int numberOfOrders = userPrompt.getNumberOfOrders();

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("\nMaking sandwich" + (i + 1) + "...");
            Sandwhich sandwhich = buildSandwich();
            System.out.println("Added: " + sandwhich);
        }
        System.out.println("\nYou order is done being made");

        protected Sandwich buildSandwich () {
        String bread = chooseBread();
        String meat = chooseMeat();
        String cheese = chooseCheese();
        String veggies = chooseVeggies();

        return new Sandwhich(bread, meat, cheese, veggies);
        // add veggiesChoice to a sandwich object
    }
private String chooseBread(){
        System.out.println("Please enter the bread option you'd like");
        return userPrompt.setScan().nextLine().trim().toLowerCase();
    }


    }

    }


