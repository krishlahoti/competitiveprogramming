package org.example.matrices;

public class TransposeOfMatrix {

    public static void main(String[] args) {

        int[][] matrices = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        createAndPrintTranspose(matrices);
        System.out.println("-------------------------------------------");
        createAndPrintTransposeOptimized(matrices);
    }

    private static void createAndPrintTransposeOptimized(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                swap(matrix, i, j);
            }
        }

        printMatrix(matrix);
    }

    static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private static void createAndPrintTranspose(int[][] matrix) {

        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }


    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
