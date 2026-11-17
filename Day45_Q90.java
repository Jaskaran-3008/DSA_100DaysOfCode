// Q90 (Strings)
// Toggle case of each character in a string.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String toggledString = toggleCase(inputString);
        System.out.println("Toggled case string: " + toggledString);
    }

    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch); // Non-alphabetic characters remain unchanged
            }
        }
        return toggledString.toString();
    }
}