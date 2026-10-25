// Q66 (Arrays (1D))
// Insert an element in a sorted array at the appropriate position.

import java.util.Scanner; 

class main {
    public static void insertElement(int[] arr, int size, int element) {
        int i = size - 1;
        while (i >= 0 && arr[i] > element) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = element;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1]; // Extra space for the new element

        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        insertElement(arr, n, element);
        n++; // Increment the size

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}