package com.Array;

public class LeftRotateByD {

//    static void lRotateOne(int[] arr){
//        int temp = arr[0];
//        for (int i = 1; i < arr.length; i++){
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length-1] = temp;
//    }
//
//    static void lRotate(int[] arr, int d){
//        for (int i=0; i<d; i++){
//            lRotateOne(arr);
//        }
//    }

    //Efficient Way
//    static void lRotate(int[] arr, int d){
//        int[] temp = new int[d];
//        for (int i = 0; i < d; i++){
//            temp[i] = arr[i];
//        }
//        for (int i = d; i < arr.length; i++){
//            arr[i-d] = arr[i];
//        }
//        for (int i = 0; i < d; i++){
//            arr[arr.length-d+i] = temp[i];
//        }
//    }

    //Reversal Algorithm
    static void lRotate(int[] arr, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    static void reverse(int[] arr, int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++; high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3;

        System.out.println("Before Rotation...");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();

        System.out.println("After Rotation...");
        lRotate(arr, d);
        for (int k : arr) {
            System.out.print(k + " ");
        }

    }
}
