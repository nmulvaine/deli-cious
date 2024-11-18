package com.pluralsight.capstone2.utilities;

import com.pluralsight.capstone2.sandwich.SandwichIngredients;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class ReceiptWriter {
    static String time = LocalDateTime.now().toString().replace(":", "-");
    static String folderPath = "./src/main/java/resources/customer-receipt";
    static String filePath = "receipt_" + time;

    public static class Receipt {
        public void generateReceipt(String customerName, List<SandwichIngredients> sandwiches, double totalAmount) {
            try {
                // Ensure the directory exists
                new File(folderPath).mkdirs();

                // Write to the file
                try (FileOutputStream writer = new FileOutputStream(folderPath + "/" + filePath + ".csv")) {
                    writer.write(("Receipt\n").getBytes());
                    writer.write(("Customer: " + customerName + "\n").getBytes());
                    writer.write(("Date: " + time + "\n").getBytes());
                    writer.write("==============================\n".getBytes());

                    int count = 1;
                    for (SandwichIngredients sandwich : sandwiches) {
                        writer.write(("Sandwich " + count + ":\n").getBytes());
                        writer.write((" - Bread: " + sandwich.getBread() + "\n").getBytes());
                        writer.write((" - Meat: " + sandwich.getMeat() + "\n").getBytes());
                        writer.write((" - Cheese: " + sandwich.getCheese() + "\n").getBytes());
                        writer.write((" - Veggies: " + sandwich.getVeggies() + "\n").getBytes());
                        writer.write((" - Sauces: " + sandwich.getSauces() + "\n").getBytes());
                        writer.write((" - Drink: " + sandwich.getDrinks() + "\n").getBytes());
                        writer.write((" - Chips: " + sandwich.getChips() + "\n").getBytes());
                        count++;
                    }

                    writer.write("==============================\n".getBytes());
                    writer.write(("Total Amount Paid: $" + totalAmount + "\n").getBytes());
                    writer.write("==============================\n".getBytes());
                    writer.write("Thank you for your order!\n".getBytes());
                }
            } catch (IOException e) {
                System.out.println("Error writing receipt: " + e.getMessage());
            }
        }
    }
}
