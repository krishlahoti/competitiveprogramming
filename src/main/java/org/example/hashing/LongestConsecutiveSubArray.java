package org.example.hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubArray {

    public static int longestSubArrayLength(int[] arr) {
        Set<Integer> h = new HashSet<>();

        for (int x : arr) {
            h.add(x);
        }

        int res = 1;

        for (Integer x : h) {
            if (!h.contains(x - 1)) {
                int curr = 1;
                while (h.contains(x + curr)) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 2, 8, 2};

        System.out.println("Longest subsequent elements: " + longestSubArrayLength(arr));
    }
}
