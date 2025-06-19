package org.example.binarysearch;

public class PeakElementInUnsortedArray {

    public static int peakElement(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15};
        System.out.println("Peak element is: " + peakElement(arr));
    }
}
