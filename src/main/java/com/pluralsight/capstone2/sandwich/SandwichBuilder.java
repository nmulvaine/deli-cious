package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.UserChoice;
import com.pluralsight.capstone2.utilities.UserPrompt;

import java.util.ArrayList;
import java.util.List;

public class SandwichBuilder<NumberOfOrders>
{
    private List<SandwichIngredients> sandwichList = new ArrayList<>();
    private List<NumberOfOrders> sandwichesInOrder = new ArrayList<>();

    public void addSandwich(SandwichIngredients sandwich)
    {
        sandwichList.add(sandwich);
    }

    public List<SandwichIngredients> getSandwichList()
    {
        return sandwichList;
    }

    public SandwichIngredients createSandwich()
    {
        UserPrompt up;
        UserChoice<String> userChoice;
        for ()
            userChoice = new UserChoice<>("");
        System.out.println("Enter bread type:");
        String bread = userChoice.getScan().nextLine().trim();
        System.out.println("Enter meat type:");
        String meat = userChoice.getScan().nextLine().trim();
        System.out.println("Enter cheese type:");
        String cheese = userChoice.getScan().nextLine().trim();
        System.out.println("Enter veggies:");
        String veggies = userChoice.getScan().nextLine().trim();
        return new SandwichIngredients(bread, meat, cheese, veggies);
    }

    public void displayOrderSummary()
    {
        System.out.println("\nOrder Summary");
        for (SandwichIngredients sandwich : sandwichList) {
            System.out.println(sandwich);
        }
    }

    public List<NumberOfOrders> getSandwichesInOrder()
    {

        return sandwichesInOrder;
    }

    public void setSandwichesInOrder(List<NumberOfOrders> sandwichesInOrder)
    {
        this.sandwichesInOrder = sandwichesInOrder;
    }

    public void setSandwichList(List<SandwichIngredients> sandwichList)
    {
        this.sandwichList = sandwichList;
    }
}