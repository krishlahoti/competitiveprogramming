package org.example.arrays;

public class TrappingRainwater {

    static long trappingWater(int arr[]) {
        // Your code here
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int amount = 0;

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > leftMax[i - 1]) {
                leftMax[i] = arr[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > rightMax[i + 1]) {
                rightMax[i] = arr[i];
            } else {
                rightMax[i] = rightMax[i + 1];
            }
        }

        printArray("Left array: ", leftMax);
        printArray("Right array: ", rightMax);


        for (int i = 1; i < n - 1; i++) {
            amount = amount + (Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }

        return amount;

    }

    static void printArray(String text, int arr[]) {
        System.out.print("\n" + text);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 4, 0, 9};
        System.out.println("\nAmount of watter trapped: " + trappingWater(arr));
    }

}
