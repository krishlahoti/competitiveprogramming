package org.example.arrays;

public class StockBuySell {

    public static int maxProfit(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int[] arr2 = {4, 2, 2, 2, 4};

        System.out.println("Profit is: " + maxProfit(arr));

        System.out.println("Profit is: " + maxProfit(arr2));

    }
}
