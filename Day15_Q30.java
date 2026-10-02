// Q30 (Loops without Arrays/Strings)
// Write a program to reverse a given number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Remove the last digit from n
        }

        System.out.println("The reversed number is: " + reversedNumber);
        scanner.close();
    }
}