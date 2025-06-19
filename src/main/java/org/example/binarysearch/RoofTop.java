package org.example.binarysearch;

public class RoofTop {

    public static int maxStep(int[] arr) {
        int gain = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                count++;
                gain = Math.max(gain, count);
            } else {
                count = 0;
            }
        }

        return gain;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        int[] arr1 = {1, 2, 3, 4};

        System.out.println(maxStep(arr));
        System.out.println(maxStep(arr1));

    }
}
