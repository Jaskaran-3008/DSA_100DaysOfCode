// Q41 (Loops without Arrays/Strings)
// Write a program to swap the first and last digit of a number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int lastDigit = n % 10; // Get the last digit
        int firstDigit = 0;
        int numberOfDigits = 0;

        // Find the first digit and the number of digits
        while (n != 0) {
            firstDigit = n % 10; // Get the last digit (which will be the first digit after the loop)
            n /= 10; // Remove the last digit from n
            numberOfDigits++;
        }

        // Calculate the new number after swapping first and last digits
        int swappedNumber = lastDigit * (int) Math.pow(10, numberOfDigits - 1) + 
                            (originalNumber / 10) % (int) Math.pow(10, numberOfDigits - 2) * 10 + 
                            firstDigit;

        System.out.println("The number after swapping first and last digits is: " + swappedNumber);
        scanner.close();
    }
}