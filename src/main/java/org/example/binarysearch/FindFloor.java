package org.example.binarysearch;

public class FindFloor {

    static int findFloor(int[] arr, int k) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4638, 6977, 19284, 23396, 29178, 30918};
        int[] arr1 = {1, 2, 8, 10, 11, 12, 19};
        int[] arr2 = {1, 2, 8};
        int[] arr3 = {6089, 7261, 12533, 22771, 25223, 27318, 27737, 31372};

        int k = 8971;

        System.out.println(findFloor(arr, k));
        System.out.println(findFloor(arr1, 5));
        System.out.println(findFloor(arr2, 1));
        System.out.println(findFloor(arr3, 20508));

    }

}
