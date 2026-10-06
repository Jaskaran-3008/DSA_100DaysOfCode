// Q36 (Loops without Arrays/Strings)
// Write a program to find the HCF (GCD) of two numbers.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find HCF using the Euclidean algorithm
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("The HCF (GCD) is: " + num1);
        scanner.close();
    }
}