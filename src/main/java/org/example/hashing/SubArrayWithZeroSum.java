package org.example.hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static boolean isSubArrayExistWithSumZero(int[] arr) {

        HashSet<Integer> h = new HashSet<>();

        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (h.contains(preSum)) {
                return true;
            }

            if (preSum == 0) {
                return true;
            }

            h.add(preSum);

        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, -3, -1, 1};

        System.out.println(isSubArrayExistWithSumZero(arr));
        System.out.println();
    }
}
