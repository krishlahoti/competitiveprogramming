package org.example.arrays;

public class ReverseArrayInGroupExample {

    public static void reverseInGroup(int[] arr, int k) {

        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }


    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseInGroup(arr, 3);

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }

}
