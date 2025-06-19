package org.example.arrays;

public class MaxLengthEvenOddArray {

    public static int maxLength(int[] arr) {
        int result = 0;
        int count = 1;

        if (arr.length < 2) {
            return 1;
        }

        for (int i = 1; i < arr.length; i++) {

            if ((arr[i] % 2 == 0) && (arr[i - 1] % 2 != 0) || ((arr[i] % 2 != 0) && (arr[i - 1] % 2 == 0))) {
                count++;
            } else {
                count = 1;
            }

            result = Math.max(result, count);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 12, 14, 7, 8};
        int[] arr1 = {7, 10, 13, 14};
        int[] arr2 = {10, 12, 8, 4};
        int[] arr3 = {469, 630, 271, 707, 115, 789, 552, 952, 271, 103, 373, 596};
        int[] arr4 = {1};
        System.out.println("Max length is: " + maxLength(arr));
        System.out.println("Max length is: " + maxLength(arr1));
        System.out.println("Max length is: " + maxLength(arr2));
        System.out.println("Max length is: " + maxLength(arr3));
        System.out.println("Max length is: " + maxLength(arr4));

    }
}
