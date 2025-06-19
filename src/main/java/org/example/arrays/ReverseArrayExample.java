package org.example.arrays;

public class ReverseArrayExample {

    public static void reverseArray(int[] input) {
        int len = input.length - 1;
        int temp;

        for (int i = 0; i < len / 2; i++) {
            int endIndex = len - i;
            temp = input[endIndex];
            input[endIndex] = input[i];
            input[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverseArray(input);

        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}
