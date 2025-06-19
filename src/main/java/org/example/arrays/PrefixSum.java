package org.example.arrays;

public class PrefixSum {

    public static int prefixSum(int[] arr, int start, int end) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        if (start == 0) {
            return prefixSum[end];
        }

        return prefixSum[end] - prefixSum[start - 1];
    }

    public static void main(String[] args) {

        int[] arr = {2, 8, 3, 9, 6, 5, 4};

        System.out.println("Prefix sum of arr is: " + prefixSum(arr, 1, 3));
    }
}
