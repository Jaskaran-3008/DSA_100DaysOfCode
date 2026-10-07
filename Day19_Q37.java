// Q37 (Loops without Arrays/Strings)
// Write a program to find the LCM of two numbers.

import java.util.Scanner;
class main {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;

        System.out.println("The LCM is: " + lcm);
        scanner.close();
    }

    // Method to find GCD using the Euclidean algorithm
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}