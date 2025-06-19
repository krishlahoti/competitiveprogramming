package org.example.strings.patternsearching;

public class NaivePatternSearching {

    public static void patternSearching(String s, String pattern) {

        int n = s.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {

        String s = "ABCABCD";
        String pattern = "ABCD";

        patternSearching(s, pattern);


    }
}
