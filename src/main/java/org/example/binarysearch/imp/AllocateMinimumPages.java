package org.example.binarysearch.imp;

public class AllocateMinimumPages {

    public static int minPages(int[] arr, int k) {

        int sum = 0, max = 0;

        for (int j : arr) {
            sum = sum + j;
            max = Math.max(max, j);
        }

        int low = max, high = sum, res = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasible(arr, k, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return res;
    }

    public static boolean isFeasible(int[] arr, int k, int ans) {

        int req = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > ans) {
                req++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }

        return req <= k;
    }


    public static void main(String[] args) {

        int[] arr = {10, 5, 20};

        System.out.println("Min pages: " + minPages(arr, 2));

    }
}

