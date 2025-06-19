package org.example.arrays;

public class MxCircularSubArraySum {

    public static int maxSumUsingKadane(int[] arr) {
        int result = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            result = Math.max(result, maxEnding);
        }
        return result;
    }

    public static int overallMaxSum(int[] arr) {
        int maxNormal = maxSumUsingKadane(arr);

        if (maxNormal < 0) {
            return maxNormal;
        }

        int sumTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            sumTotal = sumTotal + arr[i];
            arr[i] = -arr[i];
        }

        int maxCircular = sumTotal + maxSumUsingKadane(arr);
        return Math.max(maxNormal, maxCircular);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -1, 2};
        int[] arr1 = {-2, -15, -25, -16, -2, 10, -27, 24};
        int[] arr2 = {8, -4, 3, -5, 4};
        int[] arr3 = {8, -8, 9, -9, 10, -11, 12};

        System.out.println("Max sum is: " + overallMaxSum(arr));
        System.out.println("Max sum is: " + overallMaxSum(arr1));
        System.out.println("Max sum is: " + overallMaxSum(arr2));
        System.out.println("Max sum is: " + overallMaxSum(arr3));

    }
}
