// Q91 (Strings)
// Remove all vowels from a string.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String stringWithoutVowels = removeVowels(inputString);
        System.out.println("String without vowels: " + stringWithoutVowels);
    }

    public static String removeVowels(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }
}