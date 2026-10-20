// Q55 (Nested Loops without Arrays/Strings)
// Write a program to print all the prime numbers from 1 to n.

import java.util.Scanner;
class main {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n to print all prime numbers from 1 to n: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}