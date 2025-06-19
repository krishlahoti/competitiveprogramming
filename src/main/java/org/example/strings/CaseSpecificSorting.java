package org.example.strings;

import java.util.Arrays;

public class CaseSpecificSorting {

    public static String caseSorting(String s) {
        char[] input = s.toCharArray();
        char[] result = new char[s.length()];

        Arrays.sort(input);

        int upper = 0;
        int lower = 0;

        while(input[lower] < 'a'){
            lower++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                result[i] = input[upper];
                upper++;
            } else {
                result[i] = input[lower];
                lower++;
            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s = "defRTSersUXI";

        System.out.println(caseSorting(s));
    }
}
