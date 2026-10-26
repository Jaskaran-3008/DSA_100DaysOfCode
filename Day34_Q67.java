// Q67 (Arrays (1D))
// Insert an element in an array at a given position.

import java.util.Scanner; 

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // Extra space for the new element
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();
        System.out.print("Enter the position where the element is to be inserted: ");
        int pos = sc.nextInt();
        // Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}