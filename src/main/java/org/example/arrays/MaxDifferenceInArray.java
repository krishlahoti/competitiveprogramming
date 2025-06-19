package org.example.arrays;

public class MaxDifferenceInArray {

    public static int maxDifference(int[] arr) {
        int max_diff = arr[1] - arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max_diff = Math.max(max_diff, arr[i] - min);
            min = Math.min(min, arr[i]);
        }

        return max_diff;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        System.out.println("Max difference is " + maxDifference(arr));

    }
}
