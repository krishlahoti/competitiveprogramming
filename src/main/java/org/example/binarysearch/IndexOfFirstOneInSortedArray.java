package org.example.binarysearch;

public class IndexOfFirstOneInSortedArray {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};

        System.out.println(firstOneIndex(arr));

    }

    private static int firstOneIndex(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return mid;
            } else if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
