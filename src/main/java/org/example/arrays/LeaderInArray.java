package org.example.arrays;

public class LeaderInArray {

    public static void printLeaderInArray(int[] arr) {

        int n = arr.length;
        int curr_leader = arr[n - 1];
        System.out.print(curr_leader + " ");

        for (int i = n - 1; i >= 0; i--) {

            if(arr[i] > curr_leader){
                curr_leader = arr[i];
                System.out.print(arr[i] + " ");
            }
        }


    }


    public static void main(String[] args) {

        int[] arr1 = {7, 10, 4, 10, 6, 5, 2};
        int[] arr2 = {16, 17, 4, 3, 5, 2};

        printLeaderInArray(arr2);
    }
}
