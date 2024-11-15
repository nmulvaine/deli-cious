package com.pluralsight.capstone2.sandwich;

import java.util.ArrayList;
import java.util.List;

public class SandwichBuilder {
    private List<SandwichIngredients> sandwichList = new ArrayList<>();
    private List<SandwichIngredients> sandwichesInOrder = new ArrayList<>();

    public void addSandwich(SandwichIngredients sandwich) {
        sandwichList.add(sandwich);
    }

    public List<SandwichIngredients> getSandwichList() {
        return sandwichList;
    }

    public SandwichIngredients createSandwich() {
        // Implementation for creating a sandwich
        return new SandwichIngredients("", "", "", "");
    }

    public void displayOrderSummary() {
        int sandwichNumber = 1;
        System.out.println("\nSummary for order " + sandwichNumber);
        for (SandwichIngredients sandwich : sandwichList) {
            System.out.println(sandwichNumber);
            sandwichNumber++;
        }
    }

    public List<SandwichIngredients> getSandwichesInOrder() {
        return sandwichesInOrder;
    }

    public void setSandwichesInOrder(List<SandwichIngredients> sandwichesInOrder) {
        this.sandwichesInOrder = sandwichesInOrder;
    }

    public void setSandwichList(List<SandwichIngredients> sandwichList) {
        this.sandwichList = sandwichList;
    }
}