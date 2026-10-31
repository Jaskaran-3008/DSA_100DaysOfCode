// Q77 (2D Arrays)
// Check if the elements on the diagonal of a matrix are distinct.

import java.util.Scanner;
  class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (areDiagonalElementsDistinct(matrix)) {
            System.out.println("The diagonal elements are distinct.");
        } else {
            System.out.println("The diagonal elements are not distinct.");
        }
    }

    public static boolean areDiagonalElementsDistinct(int[][] matrix) {
        int n = Math.min(matrix.length, matrix[0].length);
        java.util.HashSet<Integer> diagonalElements = new java.util.HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!diagonalElements.add(matrix[i][i])) {
                return false; // Duplicate found
            }
        }
        return true; // All diagonal elements are distinct
    }
}