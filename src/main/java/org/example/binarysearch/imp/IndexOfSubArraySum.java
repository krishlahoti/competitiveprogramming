package org.example.binarysearch.imp;

import java.util.ArrayList;

/*
Given an unsorted array arr containing only non-negative integers, your task is to find a continuous subarray
(a contiguous sequence of elements) whose sum equals a specified value target.
You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.

Examples:
Input: arr[] = [1,2,3,7,5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
 */

public class IndexOfSubArraySum {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int currentSum = 0;


        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        int target1 = 12;

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target2 = 15;

        int[] arr3 = {7, 2, 1};
        int target3 = 2;

        int[] arr4 = {5, 3, 4};
        int target4 = 2;

        System.out.println(subarraySum(arr1, target1));
        System.out.println(subarraySum(arr2, target2));
        System.out.println(subarraySum(arr3, target3));
        System.out.println(subarraySum(arr4, target4));
        System.out.println();

    }
}
