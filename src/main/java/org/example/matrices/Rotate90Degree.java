package org.example.matrices;

public class Rotate90Degree {

    public static void main(String[] args) {

        int[][] matrices = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotateMatrixBy90DegreeAndPrint(matrices);

    }

    private static void rotateMatrixBy90DegreeAndPrint(int[][] matrix) {

        transposeMatrix(matrix);
        System.out.println("Printing after transpose: ");
        printMatrix(matrix);

        System.out.println();

        //reverse columns of the matrix
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[0].length - 1;
            while (low < high) {
                int temp = matrix[low][i];
                matrix[low][i] = matrix[high][i];
                matrix[high][i] = temp;
                low++;
                high--;
            }
        }

        printMatrix(matrix);

    }

    private static void transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                swap(matrix, i, j);
            }
        }

    }

    static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }


    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf(" %2d ", anInt);
            }
            System.out.println();
        }
    }
}
