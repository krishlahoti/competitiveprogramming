package org.example.arrays;

public class MaxGroupFlips {

    public static int maxFlipsToMakeArraySame(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("\nFrom " + i + " to ");
                } else {
                    System.out.print(i - 1);
                }
            }
        }

        if (arr[arr.length - 1] != arr[0]) {
            System.out.println(arr.length - 1);
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 0};
        int[] arr1 = {0, 0, 1, 1, 0, 0, 1, 1, 0, 1};
        maxFlipsToMakeArraySame(arr);
        maxFlipsToMakeArraySame(arr1);
    }
}
