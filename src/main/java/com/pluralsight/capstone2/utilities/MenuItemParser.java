package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.sandwich.SandwichIngredients;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MenuItemParser {
    private String filePath = "src/main/resources/menu-items.csv";

    public List<SandwichIngredients> parseCSV(String filePath) {
        List<SandwichIngredients> sandwichList = new ArrayList<>();
        try (BufferedReader bf = Files.newBufferedReader(Paths.get(this.filePath))) {
            String line;
            bf.readLine(); // Skip header line
            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");
                SandwichIngredients menuItem = new SandwichIngredients(
                        cleanValue(values[0]), // Bread
                        cleanValue(values[2]), // Meat
                        cleanValue(values[4]), // Cheese
                        cleanValue(values[6])  // Veggies
                );
                // Set additional properties
                menuItem.setBreadSize(cleanValue(values[1]));
                menuItem.setMeatAmount(cleanValue(values[3]));
                menuItem.setCheeseAmount(cleanValue(values[5]));
                menuItem.setSauces(cleanValue(values[7]));
                menuItem.setDrinks(cleanValue(values[8]));
                menuItem.setDrinkSize(cleanValue(values[9]));
                menuItem.setChips(cleanValue(values[10]));
                menuItem.setChipsSize(cleanValue(values[11]));
                sandwichList.add(menuItem);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sandwichList;
    }

    private String cleanValue(String value) {
        return value.replaceAll("[^a-zA-Z0-9\\s]", "").trim(); // Remove non-alphanumeric characters
    }
}