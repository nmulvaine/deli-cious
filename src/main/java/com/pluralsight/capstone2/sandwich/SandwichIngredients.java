package com.pluralsight.capstone2.sandwich;

public class SandwichIngredients {
    private final String bread;
    private final String meat;
    private final String cheese;
    private final String veggies;
    private String breadSize;
    private String meatAmount;
    private String cheeseAmount;
    private String sauces;
    private String drinks;
    private String drinkSize;
    private String chips;
    private String chipsSize;

    public SandwichIngredients(String bread, String meat, String cheese, String veggies) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
    }

    // Getters
    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getVeggies() {
        return veggies;
    }

    public String getSauces() {
        return sauces;
    }

    public String getDrinks() {
        return drinks;
    }

    public String getChips() {
        return chips;
    }

    // Setters for additional fields
    public void setBreadSize(String breadSize) {
        this.breadSize = breadSize;
    }

    public void setMeatAmount(String meatAmount) {
        this.meatAmount = meatAmount;
    }

    public void setCheeseAmount(String cheeseAmount) {
        this.cheeseAmount = cheeseAmount;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public void setChipsSize(String chipsSize) {
        this.chipsSize = chipsSize;
    }
}