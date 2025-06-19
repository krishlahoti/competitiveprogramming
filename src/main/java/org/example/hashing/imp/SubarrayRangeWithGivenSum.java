package org.example.hashing.imp;

import java.util.HashMap;

public class SubarrayRangeWithGivenSum {

    static int subArraySum(int[] arr, int tar) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int currSum = 0;
        int count = 0;

        for (int num : arr) {
            currSum += num;

            if (currSum == tar) {
                count++;
            }

            if (prefixSumCount.containsKey(currSum - tar)) {
                count += prefixSumCount.get(currSum - tar);
            }

            prefixSumCount.put(currSum, prefixSumCount.getOrDefault(currSum, 0) + 1);

        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int tar = -10;

        //Output: 3
        // Subarrays with sum -10 are: [10, 2, -2, -20], [2, -2, -20, 10] and [-20, 10].
        System.out.println(subArraySum(arr, tar));

    }
}
