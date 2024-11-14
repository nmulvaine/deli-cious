package com.pluralsight.capstone2.sandwich;

import com.pluralsight.capstone2.utilities.UserChoice;

public class SandwichBuilder
{
    private String bread;
    private String meat;
    private String cheese;
    private String veggies;

    public SandwichBuilder setBread(String bread){
        this.bread = bread;
        return this;
    }

    public SandwichBuilder setMeat(String meat){
        this.meat = meat;
        return this;
    }

    public SandwichBuilder setCheese(String cheese){
        this.cheese = cheese;
        return this;
    }

    public SandwichBuilder setVeggies(String veggies){
        this.veggies = veggies;
        return this;
    }

    public SandwichIngredients build(){
        return new SandwichIngredients(bread, meat, cheese,veggies);
    }

    protected SandwichIngredients createSandwich()
    {
        UserChoice<String> userChoice = new UserChoice<>("");

        System.out.println("Enter bread type");
        String bread = userChoice.getScan().nextLine().trim();

        System.out.println("Enter meat type");
        String meat = userChoice.getScan().nextLine().trim();

        System.out.println("Enter cheese type");
        String cheese = userChoice.getScan().nextLine().trim();

        System.out.println("Enter veggies");
        String veggies = userChoice.getScan().nextLine().trim();

        return new SandwichBuilder()
                .setBread(bread)
                .setMeat(meat)
                .setCheese(cheese)
                .setVeggies(veggies)
                .build();
    }


}