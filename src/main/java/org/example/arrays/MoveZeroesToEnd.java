package org.example.arrays;

public class MoveZeroesToEnd {


    public static void moveZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        moveZerosToEnd(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
