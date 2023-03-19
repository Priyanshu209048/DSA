package com.Array;

public class LeftRotateOne {

    static void lRotate(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before Rotation...");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();

        System.out.println("After Rotation...");
        lRotate(arr);
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
