package com.pluralsight.capstone2.sandwich;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SandwichBuilderTest
{

    @BeforeEach
    void setUp()
    {
    }

    @Test
void setSandwichesInOrder_withEmptyList_throwsException() {
    SandwichBuilder sandwichBuilder = new SandwichBuilder();
    List<SandwichIngredients> emptySandwiches = List.of();

    assertThrows(IllegalArgumentException.class, () -> sandwichBuilder.setSandwichesInOrder(emptySandwiches));
}

    @Test
    void getSandwichList()
    {
    }

    @Test
    void setSandwichesInOrder_withMultipleSandwiches_setsTheListCorrectly()
    {
        SandwichIngredients sandwich1 = new SandwichIngredients("White", "Beef", "Cheddar", "Lettuce");
        SandwichIngredients sandwich2 = new SandwichIngredients("Whole Grain", "Turkey", "Swiss", "Tomatoes");
        SandwichIngredients sandwich3 = new SandwichIngredients("Sourdough", "Ham", "Provolone", "Olives");

        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        List<SandwichIngredients> sandwiches = List.of(sandwich1, sandwich2, sandwich3);

        sandwichBuilder.setSandwichesInOrder(sandwiches);
        assertEquals(sandwiches, sandwichBuilder.getSandwichesInOrder());
    }

    @Test
    void displayMultiSandwichesTest()
    {
        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        SandwichIngredients sandwich1 = new SandwichIngredients("White", "Beef", "Cheddar", "Lettuce");
        SandwichIngredients sandwich2 = new SandwichIngredients("Whole Grain", "Turkey", "Swiss", "Tomatoes");
        SandwichIngredients sandwich3 = new SandwichIngredients("Sourdough", "Ham", "Provolone", "Olives");


        sandwichBuilder.addSandwich(sandwich1);
        sandwichBuilder.addSandwich(sandwich2);
        sandwichBuilder.addSandwich(sandwich3);

        String expectedOutput = "\nSummary for order 1\n1\n2\n3\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        sandwichBuilder.displayOrderSummary();

        assertEquals(expectedOutput, outputStream.toString());
    }


    @Test
    void createSandwich()
    {
    }

    @Test
    void displayOrderSummary()
    {
    }

    @Test
    void getSandwichesInOrder()
    {
    }

    @Test
    void setSandwichesInOrder()
    {
    }

    @Test
    void setSandwichList()
    {
    }
}