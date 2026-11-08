// Q87 (Strings)
// Count spaces, digits, and special characters in a string.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int spaceCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}