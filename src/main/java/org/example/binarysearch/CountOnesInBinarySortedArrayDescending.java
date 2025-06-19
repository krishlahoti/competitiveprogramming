package org.example.binarysearch;

public class CountOnesInBinarySortedArrayDescending {

    public static int countOnes(int arr[], int N) {
        int low = 0;
        int high = N - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 0) {
                high = mid - 1;
            } else {
                if (mid == N - 1 || arr[mid + 1] == 0) {
                    return mid + 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0};

        System.out.println(countOnes(arr, arr.length));
    }
}
