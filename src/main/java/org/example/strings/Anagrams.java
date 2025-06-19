package org.example.strings;

import java.util.Arrays;

public class Anagrams {

    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        return Arrays.equals(count, new int[26]);
    }

    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";
        String s3 = "dummy";

        System.out.println("s1 and s2: " + areAnagrams(s1, s2));
        System.out.println("s1 and s3: " + areAnagrams(s1, s3));

    }
}
