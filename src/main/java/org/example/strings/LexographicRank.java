package org.example.strings;


//Assumption - all characters are distinct in the given string
public class LexographicRank {

    static final int CHAR = 256;

    public int lexographicRank(String s) {
        int res = 1;
        int n = s.length();

        int mul = factorial(n);

        int[] count = new int[CHAR];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 1; i < CHAR; i++) {
            count[i] += count[i - 1];
        }


        for (int i = 0; i < n - 1; i++) {
            mul = mul / (n - i);
            res = res + count[s.charAt(i) - 1] * mul;
            for (int j = s.charAt(i); j < CHAR; j++) {
                count[j]--;
            }
        }
        return res;
    }

    public int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        String s1 = "BAC";
        String s2 = "DCBA";
        String s3 = "STRING";

        System.out.println("Lexographic rank for " + s1 + " is: " + new LexographicRank().lexographicRank(s1));
        System.out.println("Lexographic rank for " + s2 + " is: " + new LexographicRank().lexographicRank(s2));
        System.out.println("Lexographic rank for " + s3 + " is: " + new LexographicRank().lexographicRank(s3));
        System.out.println();
    }
}
