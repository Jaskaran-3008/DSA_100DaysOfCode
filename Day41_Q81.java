// Q81 (Strings)
// Count characters in a string without using built-in length functions.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int characterCount = countCharacters(inputString);
        System.out.println("The number of characters in the string is: " + characterCount);
    }

    public static int countCharacters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
}