package com.pluralsight.capstone2.orderingsystem;

import com.pluralsight.capstone2.sandwich.SandwichBuilder;
import com.pluralsight.capstone2.sandwich.SandwichIngredients;
import com.pluralsight.capstone2.utilities.MenuItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CurrentCustomerOrderTest {
    @Test
    void saucesTesting() {
        // Arrange
        MenuItem menuItem = new MenuItem();
        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        SandwichIngredients sandwich = sandwichBuilder.createSandwich();
        String customCondiments = "Lettuce, Tomato";
        String customSauces = "Mustard, Mayo";

        // Act
        sandwich.setSauces(customSauces);
        sandwichBuilder.addSandwich(sandwich);

        // Assert
        assertEquals(customSauces, menuItem.getSauce());
        assertTrue(sandwichBuilder.getSandwichesInOrder().contains(sandwich));
    }
 }