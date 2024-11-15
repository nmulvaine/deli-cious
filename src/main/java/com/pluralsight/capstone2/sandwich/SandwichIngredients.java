package com.pluralsight.capstone2.sandwich;

public class SandwichIngredients {
    private String bread;
    private String meat;
    private String cheese;
    private String veggies;

    public SandwichIngredients(String bread, String meat, String cheese, String veggies) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
    }

    @Override
    public String toString() {
        return "SandwichIngredients{" +
               "bread='" + bread + '\'' +
               ", meat='" + meat + '\'' +
               ", cheese='" + cheese + '\'' +
               ", veggies='" + veggies + '\'' +
               '}';
    }
}