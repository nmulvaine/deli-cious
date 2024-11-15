package com.pluralsight.capstone2.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MenuItemParser {
    private String filePath = "src/main/resources/menu-items.csv";
    private List<String> breadList = new ArrayList<>();
    private List<String> meatList = new ArrayList<>();
    private List<String> cheeseList = new ArrayList<>();
    private List<String> veggiesList = new ArrayList<>();
    private List<String> saucesList = new ArrayList<>();
    private List<String> drinksList = new ArrayList<>();
    private List<String> chipsList = new ArrayList<>();

    public void parseCSV() {
        try (BufferedReader bf = Files.newBufferedReader(Paths.get(this.filePath))) {
            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 0 && !values[0].isEmpty()) breadList.add(cleanValue(values[0]));
                if (values.length > 2 && !values[2].isEmpty()) meatList.add(cleanValue(values[2]));
                if (values.length > 4 && !values[4].isEmpty()) cheeseList.add(cleanValue(values[4]));
                if (values.length > 6 && !values[6].isEmpty()) veggiesList.add(cleanValue(values[6]));
                if (values.length > 7 && !values[7].isEmpty()) saucesList.add(cleanValue(values[7]));
                if (values.length > 8 && !values[8].isEmpty()) drinksList.add(cleanValue(values[8]));
                if (values.length > 10 && !values[10].isEmpty()) chipsList.add(cleanValue(values[10]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String cleanValue(String value) {
        return value.replaceAll("[^a-zA-Z0-9\\s]", "").trim(); // Remove non-alphanumeric characters
    }

    public List<String> getBreadList() {
        return breadList;
    }

    public List<String> getMeatList() {
        return meatList;
    }

    public List<String> getCheeseList() {
        return cheeseList;
    }

    public List<String> getVeggiesList() {
        return veggiesList;
    }

    public List<String> getSaucesList() {
        return saucesList;
    }

    public List<String> getDrinksList() {
        return drinksList;
    }

    public List<String> getChipsList() {
        return chipsList;
    }
}