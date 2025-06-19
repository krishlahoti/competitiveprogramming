package org.example.binarysearch;

public class SquareRootOfNumber {

    private static int squareRoot(int n) {

        int low = 0;
        int high = n;
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 24;

        System.out.println("Square root of " + n + " is: " + squareRoot(n));
    }


}
