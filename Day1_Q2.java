// Q2 (User Inputs, Operations & Output)
// Write a program to input two numbers and display their sum, difference, product, and quotient.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum=" + (a + b) +
                ", Diff=" + (a - b) +
                ", Product=" + (a * b) +
                ", Quotient=" + (a / b));

        sc.close();
    }
}