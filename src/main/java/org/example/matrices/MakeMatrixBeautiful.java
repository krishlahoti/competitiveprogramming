package org.example.matrices;

public class MakeMatrixBeautiful {

    public static int findMinOperations(int[][] mat) {
        int n = mat.length;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int maxSum = 0;


        //Calculate the sum of each row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        //Determine the max sum among rows and column;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }

        int operations = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //Increment operations required to bring the row sums and col sums to the max sums
                int increment = Math.min(maxSum - rowSum[i], maxSum - colSum[j]);
                operations += increment;
                rowSum[i] += increment;
                colSum[j] += increment;
                mat[i][j] += increment;
            }
        }


        return operations;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 2, 3}, {3, 2, 1}};

        System.out.println(findMinOperations(mat));
    }
}
