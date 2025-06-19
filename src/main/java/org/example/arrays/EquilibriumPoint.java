package org.example.arrays;

public class EquilibriumPoint {

    public static boolean hasEquilibriumPoint(int[] arr) {

        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }

        int leftSum = 0;

        for (int k = 0; k < arr.length; k++) {

            if (leftSum == sum - leftSum - arr[k]) {
                return true;
            }

            leftSum = leftSum + arr[k];
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 8, -9, 20, 6};
        int[] arr1 = {4, 2, 2};
        int[] arr2 = {4, 2, -2};
        int[] arr3 = {3, 4, 8, -9, 9, 7};


        System.out.println(hasEquilibriumPoint(arr));
        System.out.println(hasEquilibriumPoint(arr1));
        System.out.println(hasEquilibriumPoint(arr2));
        System.out.println(hasEquilibriumPoint(arr3));

    }
}
