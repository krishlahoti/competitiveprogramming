package org.example.binarysearch.imp;

public class MedianOfTwoSortedArray {

    public static double findMedian(int[] first, int[] second) {
        int n1 = first.length;
        int n2 = second.length;
        int begin1 = 0;
        int end1 = n1;

        while (begin1 <= end1) {

            int i1 = (begin1 + end1) / 2;
            int i2 = (n1 + n2 + 1) / 2 - i1;

            int min1 = (i1 == n1) ? Integer.MAX_VALUE : first[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : first[i1 - 1];
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : second[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : second[i2 - 1];

            if (max1 <= min2 && max2 <= min1) {
                if ((n1 + n2) % 2 == 0) {
                    return ((double) (Math.max(max1, max2) + Math.min(min1, min2))) / 2;
                } else {
                    return Math.max(max1, max2);
                }
            } else if (max1 > min2) {
                end1 = i1 - 1;
            } else {
                begin1 = i1 + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] first = {10, 20, 30, 40, 50};
        int[] second = {5, 15, 25, 35, 45};

        // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
        System.out.println(findMedian(first, second));


    }
}

/*
long[] arr = {1, 2, 3, 3, 4};
static class Pair {
        long x;
        long y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // Function to find repeated element and its frequency.
    public static Pair findRepeating(long arr[], int n) {
        // Your code here

        if (n < 2) return new Pair(-1, -1);

        // Step 1: Find the repeating element using binary search
        long repeatingElement = -1L;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Expected value at index `mid` if no element is repeated
            long expected = arr[0] + mid;

            if (arr[mid] == expected) {
                // Repetition is on the right side
                low = mid + 1;
            } else {
                // Repetition is on the left side or at `mid`
                repeatingElement = arr[mid];
                high = mid - 1;
            }
        }

        if (repeatingElement == -1L) {
            return new Pair(-1, -1); // No repeating element
        }

        // Step 2: Count the occurrences of the repeating element
        int firstOccurrence = findFirstOccurrence(arr, repeatingElement);
        int lastOccurrence = findLastOccurrence(arr, repeatingElement);
        int count = lastOccurrence - firstOccurrence + 1;

        return new Pair(repeatingElement, count);
    }

    // Binary search to find the first occurrence of a target
    private static int findFirstOccurrence(long[] arr, long target) {
        int low = 0, high = arr.length - 1, first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // Continue searching to the left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return first;
    }

    // Binary search to find the last occurrence of a target
    private static int findLastOccurrence(long[] arr, long target) {
        int low = 0, high = arr.length - 1, last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // Continue searching to the right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return last;
    }

 */