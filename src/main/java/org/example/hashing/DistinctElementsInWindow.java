package org.example.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistinctElementsInWindow {

    static int[] countDistinct(int[] arr, int k) {
        int n = arr.length;
        int resultSize = n - k + 1;

        int[] result = new int[resultSize];

        for (int i = 0; i <= n - k; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }
            result[i] = set.size();
        }
        return result;
    }

    static int[] countDistinctOptimized(int[] arr, int k) {
        int n = arr.length;
        int resultSize = n - k + 1;

        int[] result = new int[resultSize];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        result[0] = map.size();

        for (int i = k; i < n; i++) {
            int key = arr[i - k];
            int value = map.get(key);

            if (value == 1) {
                map.remove(key);
            } else {
                map.put(key, value - 1);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            result[i - k + 1] = map.size();
        }
        return result;

    }

    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr1 = {10, 20, 20, 10, 30, 40, 10};
        int k1 = 4;

        int[] arr2 = {10, 10, 10, 10};
        int k2 = 3;

        int[] arr3 = {10, 20, 30, 40};
        int k3 = 3;


        printArray(countDistinct(arr1, k1));
        printArray(countDistinctOptimized(arr1, k1));
        printArray(countDistinct(arr2, k2));
        printArray(countDistinctOptimized(arr2, k2));
        printArray(countDistinct(arr3, k3));
        printArray(countDistinctOptimized(arr3, k3));
    }
}
