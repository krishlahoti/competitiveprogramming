package org.example.binarysearch;

public class CountOfOneInSortedBinaryArray {


    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 0, 0, 1, 1};

        System.out.println(countOfOne(arr));
    }

    private static int countOfOne(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == 0 || (arr[mid] == 1 && arr[mid - 1] == 0)) {
                return arr.length - mid;
            } else if (arr[mid] == 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0;
    }
}
