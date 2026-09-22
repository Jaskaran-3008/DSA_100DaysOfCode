// Q9 (User Inputs, Operations & Output)
// Write a program to calculate simple and compound interest for given principal, rate, and time.

import java.util.Scanner;

class Day5_Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate compound interest
        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}