package org.example.arrays;

public class RotateArray {


    public static void rotateArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            lRotate(arr);
        }
    }

    public static void lRotate(int[] arr) {
        int temp = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        rotateArray(arr, 2);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
