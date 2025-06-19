package org.example.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyInSortedArray {
    private static void printFreq(int[] arr) {
        Map<Integer, Integer> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.summingInt(x -> 1)
                ));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Frequency of " + entry.getKey() + " is: " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};

        printFreq(arr);
    }


}
