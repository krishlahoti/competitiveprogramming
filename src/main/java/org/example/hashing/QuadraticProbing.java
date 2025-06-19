package org.example.hashing;

public class QuadraticProbing {

    static void quadraticProbing(int[] hash, int hash_size, int[] arr, int N) {

        for (int i = 0; i < hash_size; i++) {
            hash[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            int location = arr[i] % hash_size;
            int mul = 1;
            int newLoc = location;

            while (hash[newLoc] != -1 && hash[newLoc] != arr[i]) {
                newLoc = (location + mul * mul) % hash_size;
                mul++;

                if (mul > hash_size) {
                    break;
                }
            }

            if (hash[newLoc] == -1) {
                hash[newLoc] = arr[i];
            }
        }

    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int hashSize = 11;
        int n = 4;
        int[] arr = {21, 10, 32, 43};

        int[] hash = new int[hashSize];

        quadraticProbing(hash, hashSize, arr, n);
        printArray(hash);
    }
}
