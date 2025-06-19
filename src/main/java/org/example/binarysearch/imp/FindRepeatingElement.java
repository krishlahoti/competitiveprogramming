package org.example.binarysearch.imp;

public class FindRepeatingElement {

    public static int findRepeatingElement(int[] arr) {

        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];

        while (slow != fast) {
            fast = arr[fast];
            slow = arr[slow];
        }
        return slow;

    }

    public static int findRepeatingElementHavingElementsFromZero(int[] arr) {

        int slow = arr[0] + 1;
        int fast = arr[0] + 1;

        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        } while (slow != fast);

        slow = arr[0] + 1;

        while (slow != fast) {
            fast = arr[fast] + 1;
            slow = arr[slow] + 1;
        }
        return slow - 1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 6, 5, 7, 4};
        int[] arr1 = {1, 3, 2, 4, 6, 5, 7, 3, 0};

        System.out.println("Repeating element is: " + findRepeatingElement(arr));
        System.out.println("Repeating element is: " + findRepeatingElementHavingElementsFromZero(arr1));

    }
}
