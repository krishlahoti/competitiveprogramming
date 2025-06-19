package org.example.arrays;

public class RemoveDuplicateFromSortedArray {

    public static int[] removeDuplicates(int[] arr) {
        int[] res = new int[arr.length];
        int counter = 1;
        res[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                res[counter] = arr[i];
                counter++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        int[] result = removeDuplicates(nums);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
