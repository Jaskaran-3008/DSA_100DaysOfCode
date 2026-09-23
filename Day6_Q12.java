// Q12 (Conditional Statements)
// Write a program to input an integer and check whether it is positive, negative or zero using nested if–else.

import java.util.Scanner; 

class Day6_Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else {
            if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        scanner.close();
    }
}