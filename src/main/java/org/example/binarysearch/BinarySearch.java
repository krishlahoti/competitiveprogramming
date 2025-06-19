package org.example.binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int index = -1;

        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int target = 1000;

        System.out.println("Binary Search for target " + target + ": " + binarySearch(arr, target));
    }
}
