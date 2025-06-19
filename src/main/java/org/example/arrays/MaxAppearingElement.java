package org.example.arrays;

import static org.example.arrays.TrappingRainwater.printArray;

public class MaxAppearingElement {

    public static int getMaxAppearingElement(int[] left, int[] right) {
        int[] freq = new int[100];
        int length = left.length;

        for (int i = 0; i < length; i++) {
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }
        int max = 0;

        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i] + freq[i - 1];
            if (max < freq[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] left = {1, 2, 4};
        int[] right = {4, 5, 7};

        System.out.println(getMaxAppearingElement(left, right));

    }
}
