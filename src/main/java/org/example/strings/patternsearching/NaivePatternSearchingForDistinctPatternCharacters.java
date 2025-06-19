package org.example.strings.patternsearching;

public class NaivePatternSearchingForDistinctPatternCharacters {

    public static void patternSearching(String s, String pat) {
        int n = s.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; ) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != s.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.print(i + " ");
            }
            if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }

    public static void main(String[] args) {

        String s = "ABCABCD";
        String pattern = "ABCD";

        patternSearching(s, pattern);


    }

}
