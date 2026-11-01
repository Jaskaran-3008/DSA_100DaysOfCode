// Q79 (2D Arrays)
// Perform diagonal traversal of a matrix.

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

        System.out.println("Diagonal traversal of the matrix:");
        diagonalTraversal(matrix);
    }

    public static void diagonalTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Traverse diagonals starting from the first column
        for (int rowStart = 0; rowStart < rows; rowStart++) {
            int r = rowStart;
            int c = 0;
            while (r >= 0 && c < cols) {
                System.out.print(matrix[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
        }

        // Traverse diagonals starting from the last row
        for (int colStart = 1; colStart < cols; colStart++) {
            int r = rows - 1;
            int c = colStart;
            while (r >= 0 && c < cols) {
                System.out.print(matrix[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
        }
    }
}