package org.example.matrices;

import java.util.ArrayList;
import java.util.List;

public class PrintBoundaryElements {

    public static void printBoundaryElements(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        if (row == 1) {
            for (int i = 0; i < column; i++) {
                System.out.print(matrix[0][i] + " ");
            }
        } else if (column == 1) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[i][0] + " ");
            }
        } else {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[0][i] + " ");
            }
            for (int i = 1; i < column; i++) {
                System.out.print(matrix[i][column - 1] + " ");
            }

            for (int i = column - 2; i >= 0; i--) {
                System.out.print(matrix[row - 1][i] + " ");
            }

            for (int i = row - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }

    }

    static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();

        int row = mat.length;
        int column = mat[0].length;

        if (row == 1) {
            for (int i = 0; i < column; i++) {
                result.add(Integer.valueOf(mat[0][i]));
            }
        } else if (column == 1) {
            for (int i = 0; i < row; i++) {
                result.add(Integer.valueOf(mat[i][0]));
            }
        } else {
            for (int i = 0; i < row; i++) {
                result.add(Integer.valueOf(mat[0][i]));
            }
            for (int i = 1; i < column; i++) {
                result.add(Integer.valueOf(mat[i][column - 1]));
            }

            for (int i = column - 2; i >= 0; i--) {
                result.add(Integer.valueOf(mat[row - 1][i]));
            }

            for (int i = row - 2; i > 0; i--) {
                result.add(Integer.valueOf(mat[i][0]));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrices = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printBoundaryElements(matrices);
        List<Integer> result = boundaryTraversal(matrices); // <Integer>

        System.out.println();
        result.stream().forEach(item -> System.out.print(item + " "));
    }
}
