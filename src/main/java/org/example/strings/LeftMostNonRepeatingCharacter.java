package org.example.strings;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {

    static final int CHAR = 256;

    public static int leftMostNonRepeatingCharacter(String s1) {
        int[] fIndex = new int[CHAR];

        Arrays.fill(fIndex, -1);

        for(int i =0; i < s1.length(); i++){

            if(fIndex[s1.charAt(i)] == -1){
                fIndex[s1.charAt(i)] = i;
            } else {
                fIndex[s1.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;

        for(int i =0 ; i < CHAR; i++){
            if(fIndex[i] >= 0){
                res = Math.min(res, fIndex[i]);
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }


    public static void main(String[] args) {
        String s1 = "abbcbda";

        System.out.println("For " + s1 + " leftmost non repeating character is at index: " + leftMostNonRepeatingCharacter(s1));
    }

}
