package org.example.hashing.imp;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqualsZeroAndOne {

    static int longestSum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int preSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (map.containsKey(preSum)) {
                count += map.get(preSum);
            }

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;

    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 0};

        System.out.println(longestSum(arr));

        int[] arr2 = {1, 0, 0, 1, 0, 1, 1};

        System.out.println(longestSum(arr2));
    }
}
