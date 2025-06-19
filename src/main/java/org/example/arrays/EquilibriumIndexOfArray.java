package org.example.arrays;

public class EquilibriumIndexOfArray {


    public static int getEquilibriumIndex(int[] arr) {
        int sum = 0;
        for (int k : arr) {
            sum += k;
        }

        System.out.println("Sum is: "+ sum);

        int leftSum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum = sum - arr[j];

            if (sum == leftSum) {
                return j;
            }

            leftSum += arr[j];
        }


        return 0;
    }


    public static void main(String[] args) {

        int[] input = {-7, 1, 5, 2, -4, 3, 0};

        System.out.println("Equilibrium index of the input array is: " + getEquilibriumIndex(input));

    }
}
