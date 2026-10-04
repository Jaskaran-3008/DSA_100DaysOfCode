// Q33 (Loops without Arrays/Strings)
// Write a program to check if a number is an Armstrong number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length();

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            sum += Math.pow(digit, numberOfDigits); // Add the digit raised to the power of number of digits
            n /= 10; // Remove the last digit from n
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}