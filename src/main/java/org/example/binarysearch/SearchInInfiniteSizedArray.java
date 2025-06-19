package org.example.binarysearch;

public class SearchInInfiniteSizedArray {

    public static int search(int[] arr, int target) {
        int l = 0;
        int h = 1;
        int val = arr[0];

        while (val < target) {

            l = h;
            if (2 * h < arr.length) {
                h = 2 * h;
            } else {
                h = arr.length - 1;
                val = arr[h];
            }
        }

        return binarySearch(arr, l, h, target);
    }

    public static int binarySearch(int[] arr, int low, int high, int target) {
        int index = -1;

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
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        System.out.println(search(arr, 160));
    }
}
