// Q70 (Arrays (1D))
// Rotate an array to the right by k positions.

import java.util.Scanner; 

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();
        k = k % n; // Handle cases where k is larger than the array size
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining elements
        reverse(arr, k, n - 1);
        System.out.println("The array after rotating to the right by " + k + " positions is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}