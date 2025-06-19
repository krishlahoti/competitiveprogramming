package org.example.matrices;

public class DeterminantOfMatrix {

    static int determinantOfMatrix(int[][] matrix, int n) {
        // code here
        if (n == 1) {
            return matrix[0][0];
        }

        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int determinant = 0;

        int sign = 1;

        for (int col = 0; col < n; col++) {
            int[][] submatrix = getSubMatrix(matrix, n, col);

            determinant += sign * matrix[0][col] * determinantOfMatrix(submatrix, n - 1);

            sign = -sign;
        }

        return determinant;
    }

    private static int[][] getSubMatrix(int[][] matrix, int n, int excludeCol) {
        int[][] subMatrix = new int[n - 1][n - 1];

        for (int i = 1; i < n; i++) {
            int subCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == excludeCol) {
                    continue;
                }
                subMatrix[i - 1][subCol++] = matrix[i][j];
            }
        }

        return subMatrix;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 0, 2, -1},
                {3, 0, 0, 5},
                {2, 1, 4, -3},
                {1, 0, 5, 0}};

        System.out.println("Determinant of Matrix is : " + determinantOfMatrix(matrix, 4));
    }
}
