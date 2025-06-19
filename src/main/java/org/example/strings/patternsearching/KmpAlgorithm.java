package org.example.strings.patternsearching;

public class KmpAlgorithm {

    public static void kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = new int[m];

        fillLpsArray(pattern, lps);

        int i = 0, j = 0;

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                System.out.print(i - j + " ");
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }
        }
    }

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


    public static void main(String[] args) {
        String input = "ababcababaad";
        String pattern = "ababa";

        kmpSearch(input, pattern);
    }

}
