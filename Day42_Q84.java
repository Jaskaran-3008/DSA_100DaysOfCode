// Q84 (Strings)
// Convert a lowercase string to uppercase without using built-in functions.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String inputString = sc.nextLine();

        String upperCaseString = convertToUpperCase(inputString);
        System.out.println("The uppercase string is: " + upperCaseString);
    }

    public static String convertToUpperCase(String str) {
        StringBuilder upperCaseStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                upperCaseStr.append((char) (c - ('a' - 'A')));
            } else {
                upperCaseStr.append(c);
            }
        }
        return upperCaseStr.toString();
    }
}