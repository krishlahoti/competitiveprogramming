package org.example.arrays;

//Given an array arr[] of size N where every element is in the range from 0 to n-1.
//Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].
//Link - https://www.geeksforgeeks.org/batch/dsa-self-paced/track/DSASP-Arrays/problem/rearrange-an-array-with-o1-extra-space3142

public class RearrangeArrayWithoutExtraSpace {

    public static void rearrange(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }

        for(int i=0; i <arr.length; i++){
            arr[i] = arr[i]/n;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1, 3}; //34201

        rearrange(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
