package org.example.strings;

import java.util.Arrays;


/*
Given a string s, check if it is a "Panagram" or not. Return true if the string is a Panagram, else return false.

A "Panagram" is a sentence containing every letter in the English Alphabet either in lowercase or Uppercase.

Examples:

Input: s = "Bawds jog, flick quartz, vex nymph"
Output: true
Explanation: In the given string, there are all the letters of the English alphabet. Hence, the output is true.

Input: s = "sdfs"
Output: false
Explanation: In the given string, there aren't all the letters present in the English alphabet. Hence, the output is false.

*/

public class PangramChecking {

    public static boolean checkPangram(String s) {
        // your code here

        if (s.length() < 26) return false;

        String lowerCased = s.toLowerCase();

        int[] count = new int[26];
        int[] allOnes = new int[26];
        Arrays.fill(allOnes, 1);


        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(lowerCased.charAt(i))) {
                count[lowerCased.charAt(i) - 'a'] = 1;
            }

        }

        return Arrays.equals(count, allOnes);
    }

    public static void main(String[] args) {
        String s = "Bawds jog, flick quartz, vex nymph";

        System.out.println("Is pangram: " + checkPangram(s));
    }
}
