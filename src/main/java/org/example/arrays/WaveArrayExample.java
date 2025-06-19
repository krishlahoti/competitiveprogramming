package org.example.arrays;

import static org.example.utill.Utility.printArray;

public class WaveArrayExample {

    public static void convertToWave(int[] arr) {
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 4, 7, 8, 9, 10};
        convertToWave(arr);
        convertToWave(arr1);

        printArray(arr1);


    }
}
