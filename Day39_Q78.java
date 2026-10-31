// Q78 (2D Arrays)
// Find the sum of main diagonal elements for a square matrix.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = sumOfMainDiagonal(matrix);
        System.out.println("The sum of the main diagonal elements is: " + sum);
    }

    public static int sumOfMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}