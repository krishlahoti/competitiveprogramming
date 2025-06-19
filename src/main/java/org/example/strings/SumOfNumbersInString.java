package org.example.strings;

public class SumOfNumbersInString {

    public static int findSum(String s) {
        int sum = 0;
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + ch - '0';
            } else {
                sum = sum + number;
                number = 0;
            }
        }

        sum = sum + number;
        return sum;
    }


    public static void main(String[] args) {
        String s1 = "1abc23";

        System.out.println(findSum(s1));
    }
}
