// Q11 (Conditional Statements)
// Write a program to input an integer and check whether it is even or odd using if–else.

import java.util.Scanner;

class Day6_Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        
        scanner.close();
    }
}