// Q28 (Loops without Arrays/Strings)
// Write a program to print the product of even numbers from 1 to n.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int product = 1;

        for (int i = 2; i <= n; i += 2) {
            product *= i; // Multiply the even number to the product
        }

        System.out.println("The product of even numbers from 1 to " + n + " is: " + product);
        scanner.close();
    }
}