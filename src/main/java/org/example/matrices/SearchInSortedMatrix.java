package org.example.matrices;

public class SearchInSortedMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {25, 29, 37, 49},
                {32, 33, 39, 50}};

        int target = 39;

        System.out.println("Searching for " + target + " Found: " + searchMatrix(matrix, target));

    }

    static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int n = matrix.length;

        int i = 0, j = n - 1;

        while (i < n && j >= 0) {

            if (matrix[i][j] == target) {
                System.out.println("Element found at: " + i + ", " + j);
                return true;
            }

            if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }

        }

        return false;
    }
}
