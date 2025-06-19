package org.example.strings.patternsearching;

public class LpsArrayConstruction {

    public static void fillLpsArray(String str, int[] lps) {

        int n = str.length();
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < n) {

            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }
    }

    public static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "AAABAAAAC";
        int[] arr = new int[input.length()];

        fillLpsArray(input, arr);

        printArray(arr);

    }
}
