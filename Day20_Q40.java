// Q40 (Loops without Arrays/Strings)
// Write a program to find the 1’s complement of a binary number and print it.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        StringBuilder onesComplement = new StringBuilder();

        for (int i = 0; i < binaryNumber.length(); i++) {
            char bit = binaryNumber.charAt(i);
            if (bit == '0') {
                onesComplement.append('1');
            } else if (bit == '1') {
                onesComplement.append('0');
            } else {
                System.out.println("Invalid binary number.");
                scanner.close();
                return;
            }
        }

        System.out.println("The 1's complement of the binary number is: " + onesComplement.toString());
        scanner.close();
    }
}