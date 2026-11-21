// Q98 (Strings)
// Print initials of a name with the surname displayed in full.

import java.util.Scanner;
class main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        String formattedName = formatName(name);
        System.out.println("The formatted name is: " + formattedName);
    }

    public static String formatName(String name) {
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            if (!words[i].isEmpty()) {
                initials.append(Character.toUpperCase(words[i].charAt(0))).append(". ");
            }
        }

        if (words.length > 0) {
            initials.append(words[words.length - 1]);
        }

        return initials.toString();
    }
}