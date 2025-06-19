package org.example.binarysearch;

public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int arr[], int low, int high, int target) {

        if (low > high) return -1;
        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return recursiveBinarySearch(arr, low, mid - 1, target);
        } else {
            return recursiveBinarySearch(arr, mid + 1, high, target);
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int target = 90;

        System.out.println("Binary Search for target " + target + ": " + recursiveBinarySearch(arr, 0, arr.length - 1, target));
    }
}
