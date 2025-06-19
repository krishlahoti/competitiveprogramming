package org.example.matrices;

public class BooleanMatrix {

    static void booleanMatrix(int[][] mat) {
        // code here

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] % 2 == 1) {
                    changeTheElement(mat, i, j);
                }
            }
        }

        printMatrix(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] > 0){
                    mat[i][j] = 1;
                }

            }
        }


    }

    static void changeTheElement(int[][] mat, int row, int col) {

        // change the row
        for (int i = 0; i < mat[0].length; i++) {
            mat[row][i] += 2;
        }

        //change the column
        for (int i = 0; i < mat.length; i++) {
            mat[i][col] += 2;
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
        int[][] mat = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}, {0, 0, 0}};

        booleanMatrix(mat);

        printMatrix(mat);

    }
}
