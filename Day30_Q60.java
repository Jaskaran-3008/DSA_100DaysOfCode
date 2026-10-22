// Q60 (Arrays (1D))
// Count positive, negative, and zero elements in an array.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("The number of positive elements in the array is: " + positiveCount);
        System.out.println("The number of negative elements in the array is: " + negativeCount);
        System.out.println("The number of zero elements in the array is: " + zeroCount);

        scanner.close();
    }
}