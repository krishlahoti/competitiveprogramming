package org.example.matrices;

public class SearchInStrictlySortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120},
                {130, 140, 150, 160}};

        int target = 120;

        System.out.println("Searching for " + target + " Found: " + searchMatrix(matrix, target));

    }

    static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the 2D matrix as a 1D sorted array
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int midVal = matrix[mid / cols][mid % cols];

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;

    }
}
