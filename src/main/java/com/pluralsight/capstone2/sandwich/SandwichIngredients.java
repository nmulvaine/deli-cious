package com.pluralsight.capstone2.sandwich;

public class SandwichIngredients
{

    private String bread;
    private String meat;
    private String cheese;
    private String veggies;

    public SandwichIngredients(String bread, String cheese, String meat, String veggies)
    {
        this.bread = bread;
        this.cheese = cheese;
        this.meat = meat;
        this.veggies = veggies;
    }

    @Override
    public String toString()
    {
        return "SandwichIngredients{" +
               "bread='" + bread + '\'' +
               ", meat='" + meat + '\'' +
               ", cheese='" + cheese + '\'' +
               ", veggies='" + veggies + '\'' +
               '}';
    }

    enum Size
    {
        SMALL,
        MEDIUM,
        LARGE
    }
}