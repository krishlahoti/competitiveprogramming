package org.example.arrays;

public class BettingGame {

    public static int betBalance(String result) {
        int currentSum = 4;
        int bet = 1;

        for (char round : result.toCharArray()) {
            if (bet > currentSum) {
                return -1;  // Insufficient balance for the next bet
            }

            if (round == 'W') {
                currentSum += bet;
                bet = 1;  // Reset bet to 1 after a win
            } else if (round == 'L') {
                currentSum -= bet;
                bet *= 2;  // Double the bet after a loss
            }
        }

        return currentSum;
    }

    public static void main(String[] args) {

        String s1 = "WL";
        String s2 = "WLWLLLWWLW";
        String s3 = "WLWLLWLLWWLWWW";
        String s4 = "WWLWLLL";
//        System.out.println("Bet result for " + s1 + " is: " +  betBalance(s1));
//        System.out.println("Bet result for " + s2 + " is: " +  betBalance(s2));
//        System.out.println("Bet result for " + s3 + " is: " +  betBalance(s3));
        System.out.println("Bet result for " + s4 + " is: " + betBalance(s4));

    }
}
