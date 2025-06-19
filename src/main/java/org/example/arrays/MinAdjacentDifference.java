package org.example.arrays;

public class MinAdjacentDifference {

    public static int minAdjDiff(int[] arr) {
        int n = arr.length;
        if (n == 2) {
            return Math.abs(arr[1] - arr[0]);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i%n] - arr[(i+1)%n]);
            min = Math.min(min, diff);
            System.out.println("For int i:" + i+ " diff: " + diff + " min: " + min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};

        System.out.println("Min adjacent difference: " + minAdjDiff(arr));
    }
}
