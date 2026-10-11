// Q43 (Loops without Arrays/Strings)
// Write a program to check if a number is a strong number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int sumOfFactorials = 0;

        // Calculate the sum of factorials of digits
        while (n != 0) {
            int digit = n % 10; // Get the last digit
            sumOfFactorials += factorial(digit); // Add the factorial of the digit to the sum
            n /= 10; // Remove the last digit from n
        }

        // Check if the sum of factorials is equal to the original number
        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }

        scanner.close();
    }

    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}