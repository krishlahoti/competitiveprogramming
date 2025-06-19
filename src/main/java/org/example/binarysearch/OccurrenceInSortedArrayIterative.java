package org.example.binarysearch;

public class OccurrenceInSortedArrayIterative {

    public static int getOccurrence(int[] arr, int target) {
        int left = leftIndex(arr, target);

        int right = rightIndex(arr, target);

        if (left == -1) {
            return 0;
        }
        return right - left + 1;
    }

    public static int leftIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int rightIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10};
        int target = 1;

        System.out.println("Occurrence of value " + target + ": " + getOccurrence(arr, target));
    }
}
