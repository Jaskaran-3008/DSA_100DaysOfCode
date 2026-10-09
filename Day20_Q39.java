// Q39 (Loops without Arrays/Strings)
// Write a program to find the product of odd digits of a number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int productOfOddDigits = 1;
        boolean hasOddDigit = false;

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            if (digit % 2 != 0) { // Check if the digit is odd
                productOfOddDigits *= digit; // Multiply the odd digit to the product
                hasOddDigit = true; // Set flag to true if an odd digit is found
            }
            n /= 10; // Remove the last digit from n
        }

        if (hasOddDigit) {
            System.out.println("The product of odd digits is: " + productOfOddDigits);
        } else {
            System.out.println("There are no odd digits in the number.");
        }

        scanner.close();
    }
}