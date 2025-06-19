package org.example.hashing.imp;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {

    static int maxLenSubArrayWithGivenSum(int[] arr, int sum) {

        Map<Integer, Integer> map = new HashMap<>();

        int preSum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (preSum == sum) {
                res = i + 1;
            }

            if (!map.containsKey(preSum)) {
                map.put(preSum, i);
            }

            if (map.containsKey(preSum - sum)) {
                res = Math.max(res, i - map.get(preSum - sum));
            }
        }

        return res;

    }


    public static void main(String[] args) {
        int[] arr= {8,3,1,5,-6,6,2,2};

        int sum = 4;

        System.out.println(maxLenSubArrayWithGivenSum(arr, sum));
    }
}
