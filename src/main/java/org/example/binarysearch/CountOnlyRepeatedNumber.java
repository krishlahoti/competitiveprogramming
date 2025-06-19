package org.example.binarysearch;

public class CountOnlyRepeatedNumber {
    static class Pair {
        long x;
        long y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // Function to find repeated element and its frequency.
    public static Pair findRepeating(long[] arr, int n) {
        // Your code here
        if (n < 2) return new Pair(-1, -1);

        long repeatingElement = -1L;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long expected = arr[0] + mid;

            if (arr[mid] == expected) {
                low = mid + 1;
            } else {
                repeatingElement = arr[mid];
                high = mid - 1;
            }
        }

        if (repeatingElement == -1L) {
            return new Pair(-1, -1);
        }


        return new Pair(-1, -1);
    }

    private static int findFirstOccurrence(long[] arr, long target) {

        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                first = mid;
            }
        }

        return first;
    }

    public static void main(String[] args) {

        long[] arr = {1, 2, 3, 3, 4};
        System.out.println("Repeated element is: " + findRepeating(arr, arr.length).x + " count is: " + findRepeating(arr, arr.length).y);

    }
}
