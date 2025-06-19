package org.example.hashing.imp;

import java.util.HashSet;

public class SubArrayWithGivenSum {

    public static boolean doesSubArrayContainGivenSum(int[] arr, int sum) {

        HashSet<Integer> h = new HashSet<>();

        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (preSum == sum) {
                return true;
            }

            int diff = preSum - sum;

            if (h.contains(diff)) {
                return true;
            }

            h.add(preSum);

        }

        return false;

    }

    public static void main(String[] args) {

        int[] arr = {5, 8, 6, 13, 3, -1};

        int sum = 22;

        System.out.println(doesSubArrayContainGivenSum(arr, sum));
    }
}
