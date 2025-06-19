package org.example.strings.patternsearching;

public class RabinKarpSearchBoolean {

    static int d = 256;

    //Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q) {
        // Your code here
        int n = txt.length();
        int m = pat.length();

        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;

        for (i = 1; i < m; i++) {
            h = (h * d) % q;
        }

        for (i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (i = 0; i <= n - m; i++) {
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {
                    return true;
                }
            }

            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;

                if (t < 0) {
                    t = t + q;
                }
            }
        }

        return false;

    }


    public static void main(String[] args) {
        String text = "aabaacaadaabaaba";
        String pat = "asdfa";

        System.out.println(search(pat, text, 101));
        System.out.println(search("aaba", "aabaacaadaabaaba", 101));
    }

}
