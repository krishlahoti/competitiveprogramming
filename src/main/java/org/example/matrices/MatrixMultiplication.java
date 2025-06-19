package org.example.matrices;

public class MatrixMultiplication {

    static boolean multiplyMatrix(int[][] mat1, int[][] mat2) {
        // code here
        int row1 = mat1.length;
        int col1 = mat1[0].length;

        int row2 = mat2.length;
        int col2 = mat2[0].length;

        if (row2 != col1) {
            return false;
        }

        int[][] mul = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] mat1 = {{1, 2, 3, 4}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

        int[][] mat2 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

        multiplyMatrix(mat1, mat2);
    }
}
