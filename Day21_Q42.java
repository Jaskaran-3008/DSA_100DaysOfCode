// Q42 (Loops without Arrays/Strings)
// Write a program to check if a number is a perfect number.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sumOfDivisors = 0;

        // Find the sum of proper divisors of n
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if the sum of divisors is equal to the number
        if (sumOfDivisors == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }

        scanner.close();
    }
}