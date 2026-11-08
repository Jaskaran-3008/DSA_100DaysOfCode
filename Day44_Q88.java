// Q88 (Strings)
// Replace spaces with hyphens in a string.

import java.util.Scanner;
class main {        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String modifiedString = replaceSpacesWithHyphens(inputString);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String replaceSpacesWithHyphens(String str) {
        return str.replace(' ', '-');
    }
}