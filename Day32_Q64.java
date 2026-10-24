// Q64 (Arrays (1D))
// Find the digit that occurs the most times in an integer number.

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int[] count = new int[10];
        int maxCount = 0;
        int mostFrequentDigit = -1;

        // Handle negative numbers
        if (n < 0) {
            n = -n;
        }

        // Count occurrences of each digit
        while (n > 0) {
            int digit = n % 10;
            count[digit]++;
            if (count[digit] > maxCount) {
                maxCount = count[digit];
                mostFrequentDigit = digit;
            }
            n /= 10;
        }

        System.out.println("The digit that occurs the most times is: " + mostFrequentDigit);
    }
}
