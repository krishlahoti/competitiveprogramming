package org.example.binarysearch;

public class MissingAndRepeatingNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 1, 5};

        missingAndRepeating(arr);
    }

    private static void missingAndRepeating(int[] arr) {

        int repeating = 0;
        int missing = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[Math.abs(arr[i]) - 1] > 0) {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            } else {
                repeating = Math.abs(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
            }
        }

        System.out.println("Repeating: " + repeating + " | Missing: " + missing);
    }
}
