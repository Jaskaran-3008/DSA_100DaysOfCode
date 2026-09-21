// Q8 (User Inputs, Operations & Output)
// Write a program to find and display the sum of the first n natural numbers.

import java.util.Scanner;

class Day4_Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}