// Q38 (Loops without Arrays/Strings)
// Write a program to find the sum of digits of a number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sumOfDigits = 0;

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            sumOfDigits += digit; // Add the digit to the sum
            n /= 10; // Remove the last digit from n
        }

        System.out.println("The sum of digits is: " + sumOfDigits);
        scanner.close();
    }
}