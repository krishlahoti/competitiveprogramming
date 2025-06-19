package org.example.arrays;

//https://www.geeksforgeeks.org/batch/dsa-self-paced/track/DSASP-Arrays/problem/-rearrange-array-alternately-1587115620

//Given a sorted array of positive integers.
// Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value,
// third should be second max, fourth should be second min and so on.
// Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

public class RearrangeArrayAlternately {

    public static void rearrange(int[] arr) {

        int n = arr.length;
        int max_index = n - 1;
        int min_index = 0;

        int max = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + (arr[max_index] % max) * max;
                max_index--;
            } else {
                arr[i] = arr[i] + (arr[min_index] % max) * max;
                min_index++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }


    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

        rearrange(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
