package org.example.matrices;

public class ReverseColumnsOfMatrix {

    static void reverseCol(int matrix[][]) {
        // code here
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= col / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col - 1 - j];
                matrix[i][col - 1 - j] = temp;
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf(" %2d ", anInt);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{27, 9}, {6, 18}, {7, 12}};

        reverseCol(matrix);

        printMatrix(matrix);
    }
}
