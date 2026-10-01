// Q27 (Loops without Arrays/Strings)
// Write a program to print the sum of the first n odd numbers.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (2 * i - 1); // Calculate the ith odd number and add to sum
        }

        System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
        scanner.close();
    }
}