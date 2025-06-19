package org.example.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortAccordingToArray {

    public static int[] sortA1ByA2(int[] A1, int N, int[] A2, int M) {
        Map<Integer, Integer> mapA = new HashMap<>();
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            mapA.put(A1[i], mapA.getOrDefault(A1[i], 0) + 1);
        }

        int counter = 0;

        for (int i = 0; i < M; i++) {
            int element = A2[i];

            if (mapA.containsKey(element)) {

                int value = mapA.get(element);
                for (int j = 0; j < value; j++) {
                    result[counter] = element;
                    counter++;
                }
                mapA.remove(element);

            } else {

            }
        }


        Map<Integer, Integer> sortedMap = new TreeMap<>(mapA);

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int times = entry.getValue();

            for (int i = 0; i < times; i++) {
                result[counter] = entry.getKey();
                counter++;
            }
        }

        return result;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] arr2 = {2, 1, 8, 3};
        printArray(sortA1ByA2(arr1, arr1.length, arr2, arr2.length));
    }
}
