package org.example.arrays;

public class MaxSumSubArray {

    public static int maxSum(int[] arr) {
        int result = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            result = Math.max(result, maxEnding);
            System.out.println("i: " + i + " maxEnding: " + maxEnding + " result: " +  result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -1, 2};
        int[] arr1 = {-3, 8, -2, 4, -5, 6};

        System.out.println("Max sum of arr is: " + maxSum(arr));
        System.out.println("Max sum of arr1 is: " + maxSum(arr1));
    }
}
