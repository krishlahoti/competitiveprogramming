package org.example.binarysearch;

public class MajorityElementInArray {

    public static int getMajorityElement(int[] arr) {
        int result = -1;

        int majorityElement = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == majorityElement){
                count++;
            } else {
                count--;
            }

            if(count == 0){
                majorityElement = arr[i];
                count =1;
            }

        }

        int actualCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(majorityElement == arr[i]){
                actualCount++;
            }
        }

        if(actualCount > (arr.length / 2)){
            result = majorityElement;
        }


        return result;
    }

    public static void main(String[] args) {

        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};

        System.out.println(getMajorityElement(arr));
    }
}
