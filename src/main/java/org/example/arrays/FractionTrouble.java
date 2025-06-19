package org.example.arrays;

public class FractionTrouble {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int[] largestFunction(int n, int d) {
        int bestNum = 0;
        int bestDen = 1;

        for (int denom = 1; denom <= 10000; denom++) {
            int num = (n * denom - 1) / d;

            if (gcd(num, denom) == 1) {
                if (bestNum * denom < num * bestDen) {
                    bestNum = num;
                    bestDen = denom;
                }
            }
        }

        return new int[]{bestNum, bestDen};
    }

    public static void main(String[] args) {
//        int n = 1, d = 8;
        int n = 2, d = 53;
        int[] result = largestFunction(n, d);

        System.out.println("Result is : " + result[0] + " " + result[1]);

    }
}
