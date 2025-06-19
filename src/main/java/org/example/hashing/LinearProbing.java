package org.example.hashing;

public class LinearProbing {

    static int[] linearProbing(int hash_size, int[] arr, int sizeOfArray) {
        //Your code here
        int[] hashTable = new int[hash_size];

        for (int i = 0; i < hash_size; i++) {
            hashTable[i] = -1;
        }

        // Insert elements into the hash table
        for (int i = 0; i < sizeOfArray; i++) {
            int val = arr[i] % hash_size; // Calculate the hash value

            // Linear probing to find the next available slot
            int start = val; // Remember the starting point
            while (hashTable[val] != -1 && hashTable[val] != arr[i]) {
                val = (val + 1) % hash_size; // Wrap around using modulo

                // If we loop back to the starting point, the table is full
                if (val == start) {
                    break; // Drop the element
                }
            }

            // Insert the element if a free slot is found
            if (hashTable[val] == -1) {
                hashTable[val] = arr[i];
            }
        }

        return hashTable;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int hash_size = 10;
        int[] arr = {4, 14, 24, 44};
        int sizeOfArray = arr.length;

        printArray(linearProbing(hash_size, arr, sizeOfArray));
    }

}
