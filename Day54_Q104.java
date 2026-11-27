// Q104 (Logic Enhancers)
// Write a Program to take a positive integer n as input, and find the pivot integer x such that the sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively. Print the pivot integer x. If no such integer exists, print -1. Assume that it is guaranteed that there will be at most one pivot integer for the given input.

import java.util.Scanner;
class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        int pivotInteger = findPivotInteger(n);

        if (pivotInteger != -1) {
            System.out.println("The pivot integer is: " + pivotInteger);
        } else {
            System.out.println("-1");
        }
    }

    public static int findPivotInteger(int n) {
        int totalSum = n * (n + 1) / 2; // Sum of first n integers
        int leftSum = 0;

        for (int x = 1; x <= n; x++) {
            leftSum += x;
            if (leftSum == totalSum - leftSum + x) {
                return x; // Found the pivot integer
            }
        }
        return -1; // No pivot integer found
    }
}