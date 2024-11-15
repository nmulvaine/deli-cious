package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.sandwich.SandwichIngredients;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;

public class FileWriter {
    public static class Receipt {
        public void generateReceipt(String customerName, List<SandwichIngredients> sandwiches, double totalAmount) {
            try (PrintWriter writer = new PrintWriter("receipt_" + customerName + ".txt")) {
                // Writing header and customer details
                writer.println("Receipt");
                writer.println("Customer: " + customerName);
                writer.println("Date: " + LocalDateTime.now());
                writer.println("==============================");
                // Writing each sandwich details
                int count = 1;
                for (SandwichIngredients sandwich : sandwiches) {
                    writer.println("Sandwich " + count + ":");
                    writer.println(" - Bread: " + sandwich.getBread());
                    writer.println(" - Meat: " + sandwich.getMeat());
                    writer.println(" - Cheese: " + sandwich.getCheese());
                    writer.println(" - Veggies: " + sandwich.getVeggies());
                    writer.println(" - Sauces: " + sandwich.getSauces());
                    writer.println(" - Drink: " + sandwich.getDrinks());
                    writer.println(" - Chips: " + sandwich.getChips());
                    count++;
                }
                // Writing footer with the total amount paid
                writer.println("==============================");
                writer.println("Total Amount Paid: $" + totalAmount);
                writer.println("==============================");
                writer.println("Thank you for your order!");
            } catch (IOException e) {
                System.out.println("Error writing receipt: " + e.getMessage());
            }
        }
    }
}