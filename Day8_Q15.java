// Q15 (Conditional Statements)
// Write a program to input a character and check whether it is an uppercase alphabet, lowercase alphabet, digit, or special character.

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is an uppercase alphabet.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a lowercase alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is a special character.");
        }
    }
}