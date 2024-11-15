package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.sandwich.SandwichBuilder;
import com.pluralsight.capstone2.sandwich.SandwichIngredients;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;

public class MenuItemParser
{

    SandwichBuilder builder;
    public List<SandwichIngredients> parseCSV(String filePath)
    {
        List<SandwichIngredients> sandwichList = new ArrayList<>();
        try (BufferedReader bf = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            bf.readLine();

            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");
                SandwichIngredients sandwich = new SandwichBuilder().createSandwich();
                MenuItem item = new MenuItem();
                item.setBread(values[0]);
                item.setBreadSize(values[1]);
                item.setMeat(values[2]);
                item.setMeatAmount(values[3]);
                item.setCheese(values[4]);
                item.setCheeseAmount(values[5]);
                item.setVeggie(values[6]);
                item.setSauce(values[7]);
                item.setDrink(values[8]);
                item.setDrinkSize(values[9]);
                item.setChip(values[10]);
                sandwichList.add(sandwich);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sandwichList;
    }
}