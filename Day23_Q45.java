// Q45 (Loops without Arrays/Strings)
// Write a program to find the sum of the series: 2/3 + 4/7 + 6/11 + 8/15 + ... up to n terms.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            int numerator = 2 * i; // Calculate the numerator (2, 4, 6, ...)
            int denominator = 4 * i - 1; // Calculate the denominator (3, 7, 11, ...)
            sum += (double) numerator / denominator; // Add the term to the sum
        }

        System.out.println("The sum of the series up to " + n + " terms is: " + sum);
        scanner.close();
    }
}