// Q44 (Loops without Arrays/Strings)
// Write a program to find the sum of the series: 1 + 3/4 + 5/6 + 7/8 + … up to n terms

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            int numerator = 2 * i - 1; // Calculate the numerator (1, 3, 5, ...)
            int denominator = 2 * i;   // Calculate the denominator (2, 4, 6, ...)
            sum += (double) numerator / denominator; // Add the term to the sum
        }

        System.out.println("The sum of the series up to " + n + " terms is: " + sum);
        scanner.close();
    }
}