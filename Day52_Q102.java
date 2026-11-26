// Q102 (Logic Enhancers)
// Write a Program to take a sorted array arr[] and an integer x as input, find the index (0-based) of the smallest element in arr[] that is greater than or equal to x and print it. This element is called the ceil of x. If such an element does not exist, print -1. Note: In case of multiple occurrences of ceil of x, return the index of the first occurrence.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the sorted array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the integer x: ");
        int x = sc.nextInt();

        int ceilIndex = findCeilIndex(arr, x);

        if (ceilIndex != -1) {
            System.out.println("The index of the smallest element greater than or equal to " + x + " is: " + ceilIndex);
        } else {
            System.out.println("-1");
        }
    }

    public static int findCeilIndex(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= x) {
                result = mid; // Potential ceil found
                right = mid - 1; // Search in the left half for first occurrence
            } else {
                left = mid + 1; // Search in the right half
            }
        }
        return result;
    }
}