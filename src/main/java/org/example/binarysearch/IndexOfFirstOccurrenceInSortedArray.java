package org.example.binarysearch;

public class IndexOfFirstOccurrenceInSortedArray {

    public static void main(String[] args) {

        int[] arr = {5, 10, 10, 20, 20};

        int target = 10;

        System.out.println("First occurence of target " + target + ": " + getFirstOccurence(arr, target));
    }

    private static int getFirstOccurence(int[] arr, int target) {


        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {

                if(mid == 0 || arr[mid-1] != arr[mid]){
                    return mid;
                } else {
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}
