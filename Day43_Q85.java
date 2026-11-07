// Q85 (Strings)
// Reverse a string.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String reversedString = reverseString(inputString);
        System.out.println("The reversed string is: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }
}