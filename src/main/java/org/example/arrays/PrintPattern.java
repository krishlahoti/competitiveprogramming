package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

import static org.example.utill.Utility.printList;

/*Print a sequence of numbers starting with n, without using a loop. Replace n with n - 5, n−5... until n≤0.
Then, replace n with n+5, n + 5, n+5 until n regains its initial value.
Complete the function pattern(n) which takes n as input and returns a list containing the pattern.

*/
public class PrintPattern {
    public static List<Integer> pattern(int N) {
        List<Integer> result = new ArrayList<>();
        int n = N;

        while (n > 0) {
            result.add(n);
            n = n - 5;
        }

        while (n <= N) {
            result.add(n);
            n = n + 5;
        }
        return result;
    }


    public static void main(String[] args) {

        List<Integer> result1 = pattern(16);
        printList(result1);
        System.out.println(" ");
        printList(pattern(10));

    }
}
