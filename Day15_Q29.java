// Q29 (Loops without Arrays/Strings)
// Write a program to calculate the factorial of a number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply the current number to the factorial
        }

        System.out.println("The factorial of " + n + " is: " + factorial);
        scanner.close();
    }
}