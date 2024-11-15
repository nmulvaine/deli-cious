package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.sandwich.SandwichBuilder;
import com.pluralsight.capstone2.sandwich.SandwichIngredients;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MenuItemParser {

    private SandwichBuilder builder;
String filePath = "src/main/resources/menu-items.csv";
    public MenuItemParser() {
        this.builder = new SandwichBuilder();
    }

    public List<SandwichIngredients> parseCSV(String filePath) {
        List<SandwichIngredients> sandwichList = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();
        List<String> sideList = new ArrayList<>();
        try (BufferedReader bf = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            bf.readLine(); // Skip header line

            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");

                String bread = values.length > 0 ? values[0] : "";
                String breadSize = values.length > 1 ? values[1] : "";
                String meat = values.length > 2 ? values[2] : "";
                String meatAmount = values.length > 3 ? values[3] : "";
                String cheese = values.length > 4 ? values[4] : "";
                String cheeseAmount = values.length > 5 ? values[5] : "";
                String veggies = values.length > 6 ? values[6] : "";
                String sauces = values.length > 7 ? values[7] : "";
                String drinks = values.length > 8 ? values[8] : "";
                String drinkSize = values.length > 9 ? values[9] : "";
                String chips = values.length > 10 ? values[10] : "";
                String chipsSize = values.length > 11 ? values[11] : "";

                // Parse monetary values
                double breadPrice = parsePrice(breadSize);
                double meatPrice = parsePrice(meatAmount);
                double cheesePrice = parsePrice(cheeseAmount);
                double drinkPrice = parsePrice(drinkSize);
                double chipsPrice = parsePrice(chipsSize);

                SandwichIngredients sandwich = new SandwichIngredients(bread, meat, cheese, veggies);
                sandwich.setBreadSize(breadSize);
                sandwich.setMeatAmount(meatAmount);
                sandwich.setCheeseAmount(cheeseAmount);
                sandwich.setSauces(sauces);
                sandwich.setDrinks(drinks);
                sandwich.setDrinkSize(drinkSize);
                sandwich.setChips(chips);
                sandwich.setChipsSize(chipsSize);

                // Set parsed prices
                sandwich.setBreadPrice(breadPrice);
                sandwich.setMeatPrice(meatPrice);
                sandwich.setCheesePrice(cheesePrice);
                sandwich.setDrinkPrice(drinkPrice);
                sandwich.setChipsPrice(chipsPrice);

                sandwichList.add(sandwich);

                // Add prices to price list
                priceList.add(breadPrice);
                priceList.add(meatPrice);
                priceList.add(cheesePrice);
                priceList.add(drinkPrice);
                priceList.add(chipsPrice);

                // Add sides to sides list
                if (!drinks.isEmpty()) {
                    sideList.add(drinks + " (" + drinkSize + ")");
                }
                if (!chips.isEmpty()) {
                    sideList.add(chips + " (" + chipsSize + ")");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return sandwichList;
    }

    public static void itemPrinter(parseCSV){
        // Print lists for demonstration purposes
        System.out.println("Sandwich List: " + sandwichList);
        System.out.println("Price List: " + priceList);
        System.out.println("Sides List: " + sidesList);
    }

    private double parsePrice(String value) {
        if (value == null || value.isEmpty()) {
            return 0.0;
        }
        String priceString = value.replaceAll("[^\\d.]", "");
        return priceString.isEmpty() ? 0.0 : Double.parseDouble(priceString);
    }
}