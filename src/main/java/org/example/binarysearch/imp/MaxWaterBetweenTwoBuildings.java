package org.example.binarysearch.imp;

public class MaxWaterBetweenTwoBuildings {

    static int maxWater(int[] height) {
        int n = height.length;

        if (n <= 2) {
            return 0;
        }

        int left = 0, right = n - 1;

        int maxWater = 0;

        while (left < right) {

            int water = (right - left - 1) * Math.min(height[left], height[right]);

            maxWater = Math.max(maxWater, water);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxWater;

    }

    public static void main(String[] args) {

        int[] height = {2, 1, 3, 4, 6, 5};

        System.out.println("Max water between two buildings: " + maxWater(height));
    }
}
