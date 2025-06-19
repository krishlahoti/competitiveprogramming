package org.example.binarysearch;

public class IndexOfLastOccurrenceInSortedArray {

    private static int getLastOccurrence(int[] arr, int target) {

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
        int[] arr = {5, 10, 10, 20, 20, 30, 30, 30, 30, 30};

        int target = 30;

        System.out.println("Last occurrence of target " + target + ": " + getLastOccurrence(arr, target));
    }
}
