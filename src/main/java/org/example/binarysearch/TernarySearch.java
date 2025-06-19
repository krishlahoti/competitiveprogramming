package org.example.binarysearch;

public class TernarySearch {

    public static int ternarySearch(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if (arr[mid1] == target) {
                return mid1;
            }

            if (arr[mid2] == target) {
                return mid2;
            }

            if (arr[mid1] > target) {
                r = mid1 - 1;
            } else if (arr[mid2] < target) {
                l = mid2 + 1;
            } else {
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int target = 70;

        System.out.println(ternarySearch(arr, target));
    }
}
