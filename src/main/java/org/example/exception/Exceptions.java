package org.example.exception;

class Exceptions {
    public static void main(String[]args) {
        int[] arr = null;
        try{
            int value = arr[getLocation()];
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }

    public static int getLocation() throws Exception {
        throw new Exception();
    }
}