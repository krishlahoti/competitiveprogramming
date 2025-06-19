package org.example.binarysearch.imp;

public class TwoRepeatedElement {

    public static int[] twoRepeated(int n, int arr[]) {
        // Your code here
        int[] result = new int[2]; // To store the two repeated numbers
        int index = 0; // To track the order of repeated numbers

        for (int i = 0; i < n + 2; i++) {
            int element = Math.abs(arr[i]); // Get the absolute value of the current element

            // If the value at index (element - 1) is already negative, it's a repeated number
            if (arr[element - 1] < 0) {
                result[index++] = element; // Add the repeated number to the result array
            } else {
                arr[element - 1] = -arr[element - 1]; // Mark the index as visited
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,3};

        int[] result = twoRepeated(4, arr);

        System.out.print("Printing values: ");

        for (int j : result) {
            System.out.print(j + " ");
        }

        System.out.println();
    }

}
