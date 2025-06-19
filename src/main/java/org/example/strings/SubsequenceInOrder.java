package org.example.strings;

public class SubsequenceInOrder {

    static boolean isSubsequenceInOrder(String s, String t) {
        int j = 0;

        if (s.length() < t.length()) {
            return false;
        }

        for (int i = 0; i < s.length() && j < t.length(); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
        }

        return j == t.length();
    }

    static boolean isSubSequenceInOrderRecursion(String s1, String s2, int n, int m) {

        if (m == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return isSubSequenceInOrderRecursion(s1, s2, n - 1, m - 1);
        } else return isSubSequenceInOrderRecursion(s1, s2, n - 1, m);

    }

    public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "ADE";

        System.out.println(isSubsequenceInOrder(s1, s2));
    }
}
