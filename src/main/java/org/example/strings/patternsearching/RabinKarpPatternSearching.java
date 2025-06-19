package org.example.strings.patternsearching;

public class RabinKarpPatternSearching {

    public final static int d = 256;
    public static final int q = 101; // A prime number

    public static void rabinKarpSearch(String s, String pat) {
        int n = s.length();
        int m = pat.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        for (i = 1; i < m - 1; i++) {
            h = (h * d) / q;
        }

        for (i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + s.charAt(i)) % q;
        }

        for (i = 0; i <= n - m; i++) {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters on by one
            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < m; j++) {
                    if (s.charAt(i + j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == m)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if (i < n-m) {
                t = (d * (t - s.charAt(i) * h) + s.charAt(i + m)) % q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }

    }

    public static void main(String[] args) {

        String s = "ABCABCD";
        String pattern = "ABCD";

        rabinKarpSearch(s, pattern);


    }
}
