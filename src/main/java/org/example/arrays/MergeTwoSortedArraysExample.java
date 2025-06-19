package org.example.arrays;

public class MergeTwoSortedArraysExample {
    public static int[] mergeTwoSortedArrays(int[] input1, int[] input2) {

        int m = input1.length;
        int n = input2.length;
        int resultSize = m + n;

        int i = 0, j = 0, k = 0;

        int[] result = new int[resultSize];
        while (i < m && j < n) {

            if (input1[i] < input2[j]) {
                result[k++] = input1[i++];
            } else {
                result[k++] = input2[j++];
            }

        }

        while (i < m) {
            result[k++] = input1[i++];
        }

        while (j < m) {
            result[k++] = input2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 3, 4, 6, 9, 11};
        int[] input2 = {2, 5, 7, 8};

        int[] result = mergeTwoSortedArrays(input1, input2);

        for (int a : result) {
            System.out.print(a + " ");
        }

    }
}
