// Q59 (Arrays (1D))
// Count even and odd numbers in an array.

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

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("The number of even elements in the array is: " + evenCount);
        System.out.println("The number of odd elements in the array is: " + oddCount);

        scanner.close();
    }
}