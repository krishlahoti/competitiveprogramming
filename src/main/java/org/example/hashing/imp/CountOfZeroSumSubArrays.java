package org.example.hashing.imp;

import java.util.HashMap;

public class CountOfZeroSumSubArrays {

    public static int findCountOfZeroSumSubArrays(int[] arr) {
        // code here.
        HashMap<Integer, Integer> preFixSumCount = new HashMap<>();

        int preSum = 0;
        int count = 0;

        preFixSumCount.put(0, 1);

        for(int i=0; i < arr.length; i++){
            preSum += arr[i];

            if(preFixSumCount.containsKey(preSum)){
                count += preFixSumCount.get(preSum);
            }

            preFixSumCount.put(preSum, preFixSumCount.getOrDefault(preSum, 0) + 1);

        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {0,0,5,5,0,0};

        System.out.println(findCountOfZeroSumSubArrays(arr));
    }
}
