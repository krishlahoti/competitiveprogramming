package org.example.matrices;

import java.util.Arrays;

public class MedianInRowWiseSortedArray {

    static int matrixMedian(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;

        int min = mat[0][0];
        int max = mat[0][c - 1];

        for (int i = 0; i < r; i++) {
            if (mat[i][0] < min) {
                min = mat[i][0];
            }

            if (mat[i][c - 1] > max) {
                max = mat[i][c - 1];
            }
        }

        int medianPosition = (r * c + 1) / 2;

        while (min < max) {

            int mid = min + (max - min) / 2;
            int midPos = 0;

            for (int i = 0; i < r; i++) {
                int pos = Arrays.binarySearch(mat[i], mid) + 1;
                midPos += Math.abs(pos);

            }
            if (midPos < medianPosition) {
                min = mid + 1;
            } else {
                max = mid;
            }


        }

        return min;
    }

    public static void main(String[] args) {

        int[][] mat = {{5, 10, 20, 30, 40},
                {1, 2, 3, 4, 6},
                {11, 13, 15, 17, 19}
        };

        System.out.println("Median is : " + matrixMedian(mat));

    }
}
