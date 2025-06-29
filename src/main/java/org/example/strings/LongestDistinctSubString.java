package org.example.strings;

import java.util.Arrays;

public class LongestDistinctSubString {

    //O(n^2
    public int longestDistinctSubStringWithNestedLoop(String s) {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)]) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
        }

        return res;
    }

    public int longestDistinctSubStringOptimized(String s) {
        int n = s.length();
        int res = 0;
        int[] prev = new int[256];
        Arrays.fill(prev, -1);
        int i = 0;

        for (int j = 0; j < n; j++) {
            i = Math.max(i, prev[s.charAt(j)] + 1);
            int maxEnd = j - i + 1;
            res = Math.max(res, maxEnd);
            prev[s.charAt(j)] = j;
        }
        return res;
    }

    public int longestUniqueSubstring(String str) {
        String test = "";

        // Result
        int maxLength = -1;

        // Return zero if string is empty
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current) + 1);
            }
            test = test + c;
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        String s1 = "geeksforgeek";

        LongestDistinctSubString longestDistinctSubString = new LongestDistinctSubString();
        System.out.println(longestDistinctSubString.longestDistinctSubStringWithNestedLoop(s1));
        System.out.println(longestDistinctSubString.longestDistinctSubStringOptimized(s1));
        System.out.println(longestDistinctSubString.longestUniqueSubstring(s1));


    }
}
