// Q22 (Conditional Statements)
// Write a program to find profit or loss percentage given cost price and selling price.

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;
        double percentage = (Math.abs(profitOrLoss) / costPrice) * 100;

        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss);
            System.out.println("Profit Percentage: " + percentage + "%");
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: " + Math.abs(profitOrLoss));
            System.out.println("Loss Percentage: " + percentage + "%");
        } else {
            System.out.println("No profit, no loss.");
        }

        scanner.close();
    }
}