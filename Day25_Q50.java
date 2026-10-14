// Q49 (Nested Loops without Arrays/Strings)
// Write a program to print the following pattern:
// 5
// 45
// 345
// 2345
// 12345

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print numbers in descending order starting from (rows - i + 1)
            for (int j = rows - i + 1; j <= rows; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
