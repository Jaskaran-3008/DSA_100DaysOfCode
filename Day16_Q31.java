// Q31 (Loops without Arrays/Strings)
// Write a program to take a number as input and print its equivalent binary representation.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        StringBuilder binaryRepresentation = new StringBuilder();

        if (n == 0) {
            binaryRepresentation.append("0");
        } else {
            while (n > 0) {
                int remainder = n % 2; // Get the remainder when divided by 2
                binaryRepresentation.insert(0, remainder); // Prepend the remainder to the binary representation
                n /= 2; // Divide n by 2
            }
        }

        System.out.println("The binary representation is: " + binaryRepresentation.toString());
        scanner.close();
    }
}