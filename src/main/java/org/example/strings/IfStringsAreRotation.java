package org.example.strings;

import java.util.Arrays;

public class IfStringsAreRotation {

    boolean areRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        return (s1 + s1).contains(s2);
    }

    public static boolean isRotatedBy2(String s1, String s2) {
        // Your code here

        if (s1.length() != s2.length()) return false;

        char[] s3 = new char[s2.length()];

        for (int i = 0; i < s2.length(); i++) {
            int j = i + 2 >= s2.length() ? i + 2 - s2.length() : i + 2;
            s3[i] = s2.charAt(j);
        }

        if (String.valueOf(s3).equals(s1)) {
            return true;
        }

        char[] s4 = new char[s2.length()];

        for (int i = 0; i < s2.length(); i++) {
            int j = (s2.length() - 2 + i) % s2.length();
            s4[i] = s2.charAt(j % s2.length());
        }


        return String.valueOf(s4).equals(s1);

    }

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "cdab";
        String s3 = "acbd";

        System.out.println("Strings " + s1 + " and " + s2 + " are rotations of each other: " + new IfStringsAreRotation().areRotation(s1, s2));
        System.out.println("Strings " + s1 + " and " + s3 + " are rotations of each other: " + new IfStringsAreRotation().areRotation(s1, s3));


        String a1 = "amazon";
        String a2 = "azonam";

        System.out.println("Strings " + a1 + " and " + a2 + " are rotations of each other: " + isRotatedBy2(a1, a2));

    }
}
