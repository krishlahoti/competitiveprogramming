package org.example.arrays;


import java.util.HashMap;
import java.util.Map;

//Moore's voting algorithm
public class MajorityElementInArray {

    public static int getMajorityElementUsingMap(int[] arr) {
        // Time complexity -> O(N log N) + O(N)
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value > (arr.length / 2)) {
                return key;
            }
        }
        return -1;
    }

    public static int getMajorityElement(int[] arr) {
        // Time complexity -> O(N)
        int element = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                element = arr[i];
                count = 1;
            }
        }
        int actualCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                actualCount++;
            }
        }

        if (actualCount > (arr.length / 2)) {
            return element;
        }

        return -1;


    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int[] arr1 = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        System.out.println("Majority element is: " + getMajorityElementUsingMap(arr));
        System.out.println("Majority element is: " + getMajorityElement(arr));
        System.out.println("Majority element is: " + getMajorityElementUsingMap(arr1));
        System.out.println("Majority element is: " + getMajorityElement(arr1));

    }
}
