package org.example.binarysearch;

public class OccurrenceInSortedArray {

    public static int getOccurrence(int[] arr, int target) {
        int length = arr.length;
        int i = firstIndex(arr, 0, length - 1, target, length);
        int j = lastIndex(arr, 0, length - 1, target, length);

        if (i != -1 && j != -1) {
            return j - i + 1;
        } else {
            return 0;
        }
    }

    private static int firstIndex(int[] arr, int low, int high, int target, int length) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || target > arr[mid - 1]) && arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                return firstIndex(arr, (mid + 1), high, target, length);
            } else {
                return firstIndex(arr, low, (mid - 1), target, length);
            }
        }
        return -1;
    }

    private static int lastIndex(int[] arr, int low, int high, int target, int length) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == length - 1 || target < arr[mid + 1]) && arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                return lastIndex(arr, low, mid - 1, target, length);
            } else {
                return lastIndex(arr, mid + 1, high, target, length);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
        int target = 9;

        System.out.println("Occurrence of value " + target + ": " + getOccurrence(arr, target));
    }
}