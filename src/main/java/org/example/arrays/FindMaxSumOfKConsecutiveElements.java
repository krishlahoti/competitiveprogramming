package org.example.arrays;

public class FindMaxSumOfKConsecutiveElements {

    //Naive solution with O(N^2) time complexity
    public static int findMaxSum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum = sum + arr[i + j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static int findMaxSumOptimizedSolution(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {1, 8, 30, -5, 20, 7};
        int[] arr1 = {5, -10, 6, 90, 3};

        System.out.println("Max sum of arr is : " + findMaxSum(arr, 3));
        System.out.println("Max sum of arr(optimized) is : " + findMaxSumOptimizedSolution(arr, 3));
        System.out.println("Max sum of arr1(optimized) is : " + findMaxSumOptimizedSolution(arr1, 2));
        System.out.println("Max sum of arr1 is : " + findMaxSum(arr1, 2));

    }
}
