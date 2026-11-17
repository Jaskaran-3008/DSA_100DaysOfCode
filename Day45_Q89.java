// Q89 (Strings)
// Count frequency of a given character in a string.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter a character to count its frequency: ");
        char characterToCount = sc.next().charAt(0);

        int frequency = countCharacterFrequency(inputString, characterToCount);
        System.out.println("The frequency of '" + characterToCount + "' in the string is: " + frequency);
    }

    public static int countCharacterFrequency(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}