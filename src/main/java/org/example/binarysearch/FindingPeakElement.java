package org.example.binarysearch;

public class FindingPeakElement {
    private static int findPeak(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid];
            }

            if (mid > 0 && arr[mid - 1] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] arr2 = {5, 20, 40, 30, 20, 10};

        System.out.println(findPeak(arr));
        System.out.println(findPeak(arr2));
    }

}
