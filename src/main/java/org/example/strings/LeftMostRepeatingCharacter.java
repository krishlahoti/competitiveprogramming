package org.example.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.lang.Integer;


public class LeftMostRepeatingCharacter {

    public static int leftMostRepeatingCharacter(String s1) {

        int index = Integer.MAX_VALUE;
        HashSet<Character> charSet = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            if(charSet.contains(s1.charAt(i))){
                int currIndex = s1.indexOf(s1.charAt(i));
                index = Math.min(index, currIndex);
            } else {
                charSet.add(s1.charAt(i));
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }

    public static int leftMostRepeatingCharacterOptimized(String s1) {
        int[] count = new int[26];

        for(int i = 0; i < s1.length(); i ++){
            count[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s1.length(); i ++){
            if(count[s1.charAt(i) - 'a'] > 1){
                return i;
            }
        }

        return -1;
    }

    public static int leftMostRepeatingCharacterMoreOptimized(String s1) {
       int[] fIndex = new int[26];

        Arrays.fill(fIndex, -1);

        int res = Integer.MAX_VALUE;

        for(int i = 0; i < s1.length(); i++){
            int fi = fIndex[s1.charAt(i) - 'a'];

            if(fi == -1){
                fIndex[s1.charAt(i) - 'a'] = i;
            } else {
                res = Math.min(res, fi);
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }


    public static void main(String[] args) {
        String s1 = "geekforgeeks";
        String s2 = "abbcc";

        System.out.println("Leftmost occurrence for " + s1 + " is: " + leftMostRepeatingCharacter(s1));
        System.out.println("Leftmost occurrence for " + s1 + " is: " + leftMostRepeatingCharacterOptimized(s1));
        System.out.println("Leftmost occurrence for " + s1 + " is: " + leftMostRepeatingCharacterMoreOptimized(s1));
        System.out.println("Leftmost occurrence for " + s2 + " is: " + leftMostRepeatingCharacter(s2));
        System.out.println("Leftmost occurrence for " + s2 + " is: " + leftMostRepeatingCharacterOptimized(s2));
        System.out.println("Leftmost occurrence for " + s2 + " is: " + leftMostRepeatingCharacterMoreOptimized(s2));
    }
}
