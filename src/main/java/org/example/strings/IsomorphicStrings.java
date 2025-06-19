package org.example.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IsomorphicStrings {

    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        HashSet<Character> mappedChars = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (mappedChars.contains(c2)) {
                    return false;
                }

                map.put(c1, c2);
                mappedChars.add(c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println("S1 AND S2 : " + areIsomorphic(s1, s2));

        String s3 = " xyz";
        System.out.println("S1 AND S3 : " + areIsomorphic(s1, s3));

    }
}
