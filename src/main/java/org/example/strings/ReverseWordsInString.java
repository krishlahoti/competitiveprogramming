package org.example.strings;

public class ReverseWordsInString {

    public static String reverseWords(char[] s1) {
        int start = 0;
        for (int end = 0; end < s1.length; end++) {
            if (s1[end] == ' ') {
                reverse(s1, start, end - 1);
                // Skip multiple consecutive spaces
                while (end + 1 < s1.length && s1[end + 1] == ' ') {
                    end++;
                }
                start = end + 1;
            }
        }
        reverse(s1, start, s1.length - 1);
        reverse(s1, 0, s1.length - 1);
        return new String(s1);
    }

    public static void reverse(char[] s, int low, int high) {
        while (low < high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        String s1 = "welcome to gfk";
        String s2 = "cb ipctpyru  bovcbo";
        String s2Reverse = "bovcbo ipctpyru cb";

        System.out.println("Reversed string is: " + reverseWords(s1.toCharArray()));

        System.out.println(reverseWords(s2.toCharArray()));
        System.out.println(s2Reverse);

    }
}

