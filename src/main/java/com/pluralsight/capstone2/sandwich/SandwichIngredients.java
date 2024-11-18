package com.pluralsight.capstone2.sandwich;

public class SandwichIngredients
{
    private final String bread;
    private final String meat;
    private final String cheese;
    private final String veggies;
    private String sauces;
    private String drinks;
    private String chips;


    public SandwichIngredients(String bread, String meat, String cheese, String veggies)
    {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
    }

    // Getters
    public String getBread()
    {
        return bread;
    }

    public String getMeat()
    {
        return meat;
    }

    public String getCheese()
    {
        return cheese;
    }

    public String getVeggies()
    {
        return veggies;
    }

    public String getSauces()
    {
        return sauces;
    }

    public String getDrinks()
    {
        return drinks;
    }

    public String getChips()
    {
        return chips;
    }

    // Setters
    public void setSauces(String sauces)
    {
        this.sauces = sauces;
    }

    public void setDrinks(String drinks)
    {
        this.drinks = drinks;
    }

    public void setChips(String chips)
    {
        this.chips = chips;
    }
}