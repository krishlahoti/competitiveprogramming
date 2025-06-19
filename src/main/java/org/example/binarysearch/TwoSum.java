package org.example.binarysearch;

//Two pointer algorithm
public class TwoSum {
    public static boolean twoSum(int[] arr, int sum) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] + arr[right] == sum) return true;

            if (arr[left] + arr[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 9, 11, 12, 20, 30};
        int sum = 21;

        System.out.println(twoSum(arr, sum));
    }
}
