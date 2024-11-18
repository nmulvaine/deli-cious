package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.sandwich.SandwichIngredients;

import java.util.List;

internal class Test
{[Test]
public void TestReceiptGenerationWithMultipleSandwiches()
{
    String customerName = "Test Customer";
    List<SandwichIngredients> sandwiches = new List<SandwichIngredients>
    {
        new SandwichIngredients("White", "Beef", "Cheddar", "Lettuce, Tomato", "Mayo", "Coke", "Crunchy"),
        new SandwichIngredients("Whole Grain", "Turkey", "Swiss", "Avocado", "Mustard", "Sprite", "Crispy")
    };
    double totalAmount = 20.00;

    ReceiptWriter.Receipt receipt = new ReceiptWriter.Receipt();
    receipt.generateReceipt(customerName, sandwiches, totalAmount);

    String expectedFilePath = "receipt_" + ReceiptWriter.time + ReceiptWriter.folderPath + ".csv";
    Assert.IsTrue(File.Exists(expectedFilePath));

    String[] lines = File.ReadAllLines(expectedFilePath);
    Assert.AreEqual("Receipt", lines[0]);
    Assert.AreEqual("Customer: John Doe", lines[1]);
    Assert.IsTrue(lines[2].StartsWith("Date:"));
    Assert.AreEqual("===============================", lines[3]);
    Assert.AreEqual("Sandwich 1:", lines[4]);
    Assert.AreEqual(" - Bread: White", lines[5]);
    Assert.AreEqual(" - Meat: Beef", lines[6]);
    Assert.AreEqual(" - Cheese: Cheddar", lines[7]);
    Assert.AreEqual(" - Veggies: Lettuce, Tomato", lines[8]);
    Assert.AreEqual(" - Sauces: Mayo", lines[9]);
    Assert.AreEqual(" - Drink: Coke", lines[10]);
    Assert.AreEqual(" - Chips: Crunchy", lines[11]);
    Assert.AreEqual("Sandwich 2:", lines[12]);
    Assert.AreEqual(" - Bread: Whole Grain", lines[13]);
    Assert.AreEqual(" - Meat: Turkey", lines[14]);
    Assert.AreEqual(" - Cheese: Swiss", lines[15]);
    Assert.AreEqual(" - Veggies: Avocado", lines[16]);
    Assert.AreEqual(" - Sauces: Mustard", lines[17]);
    Assert.AreEqual(" - Drink: Sprite", lines[18]);
    Assert.AreEqual(" - Chips: Crispy", lines[19]);
    Assert.AreEqual("===============================", lines[20]);
    Assert.AreEqual("Total Amount Paid: $12.50", lines[21]);
    Assert.AreEqual("===============================", lines[22]);
    Assert.AreEqual("Thank you for your order!", lines[23]);
}
    [Test]
    public void Test1()
    {
        Assert.Fail("Tests are not implemented");
    }
}