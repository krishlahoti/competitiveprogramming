package org.example.arrays;

import static org.example.utill.Utility.printArray;

public class MaxOccuredInteger {

    public static int maxOccured(int n, int l[], int r[], int maxx) {

        int[] freq = new int[maxx + 2];

        for (int i = 0; i < n; i++) {
            freq[l[i]]++;
            freq[r[i] + 1]--;
        }

        printArray(freq);
        int maxFreq = freq[0];
        int result = 0;

        for (int i = 1; i <= maxx; i++) {
            freq[i] = freq[i] + freq[i - 1];

            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = i;
            }
        }

        System.out.println(" ");

        printArray(freq);

        return result;

    }


    public static void main(String[] args) {
        int n = 4;
        int[] l = {1, 4, 3, 1}, r = {15, 8, 5, 4};
        int maxx = 15;

        System.out.println("\nMax occured element is: " + maxOccured(n, l, r, maxx));
    }
}
