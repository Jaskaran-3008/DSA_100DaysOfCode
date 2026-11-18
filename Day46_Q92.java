// Q92 (Strings)
// Find the first repeating lowercase alphabet in a string.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        char firstRepeatingChar = findFirstRepeatingChar(inputString);
        if (firstRepeatingChar != '\0') {
            System.out.println("The first repeating lowercase alphabet is: " + firstRepeatingChar);
        } else {
            System.out.println("No repeating lowercase alphabet found.");
        }
    }

    public static char findFirstRepeatingChar(String str) {
        int[] charCount = new int[26]; // Array to count occurrences of each lowercase letter

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                int index = ch - 'a';
                charCount[index]++;
                if (charCount[index] == 2) { // If the character has appeared twice
                    return ch;
                }
            }
        }
        return '\0'; // Return null character if no repeating lowercase alphabet is found
    }
}