package org.example.arrays;

public class SubArrayWithGivenSum {

    public static boolean doesSubArrayContainGivenSum(int[] arr, int sum) {
        int start = 0;
        int current = 0;

        for (int e = 0; e < arr.length; e++) {
            current += arr[e];

            while (sum < current) {
                current -= arr[start];
                start++;
            }

            if (current == sum) return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int[] arr1 = {4, 8, 12, 5};
        System.out.println("Result: " + doesSubArrayContainGivenSum(arr, 33));
        System.out.println("Result: " + doesSubArrayContainGivenSum(arr1, 17));
    }

}
