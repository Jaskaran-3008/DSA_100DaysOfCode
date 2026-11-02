// Q82 (Strings)
// Print each character of a string on a new line.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        printCharacters(inputString);
    }

    public static void printCharacters(String str) {
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}