package org.example.arrays;

public class CountMaxConsecutiveOnes {

    public static int countMaxConsecutiveOnes(int[] arr) {
        int maxOnes = 0;
        int curr = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                curr = 0;
            } else {
                curr++;
                maxOnes = Math.max(maxOnes, curr);
            }
        }
        return maxOnes;
    }


    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 1, 1, 1, 0, 0, 1, 1};
        System.out.println(countMaxConsecutiveOnes(arr));
    }
}
