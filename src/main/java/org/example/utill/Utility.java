package org.example.utill;

import java.util.List;

public class Utility {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static<T> void printList(List<T> list) {
      for(T element: list){
          System.out.print(element + " ");
      }
    }


}
