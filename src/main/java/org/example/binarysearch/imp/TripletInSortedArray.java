package org.example.binarysearch.imp;

public class TripletInSortedArray {

    public static boolean doesTripletExist(int[] arr, int target) {

        for (int i = 0; i < arr.length - 2; i++) {

            int newTarget = target - arr[i];

            if (findPair(arr, newTarget, i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findPair(int[] arr, int target, int low) {
        int high = arr.length - 1;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 15, 18};
        int target = 33;

        System.out.println("Triplet sum: " + doesTripletExist(arr, target));
    }
}
