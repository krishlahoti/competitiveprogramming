package org.example.strings;

import java.util.Arrays;

public class AnagramSearch {

    static final int CHAR = 256;

    private static boolean search(String pat, String text) {
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];

        for (int i = 0; i < pat.length(); i++) {
            CT[text.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }

        for (int i = pat.length(); i < text.length(); i++) {

            if (Arrays.equals(CP, CT)) {
                return true;
            }

            CT[text.charAt(i)]++;
            CT[text.charAt(i-pat.length())]--;
        }

        return false;

    }

    public static void main(String[] args) {

        String text = "geeksforgeeks";
        String pat = "frog";

        System.out.println(search(pat, text));
    }


}
