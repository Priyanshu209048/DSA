package com.Array;

public class MoveZerosToEnd {

//    static void moveToEnd(int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == 0){
//                for (int j = i+1; j < arr.length; j++){
//                    if (arr[j] != 0){
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//        }
//    }

    //Efficient Way
    static void moveToEnd(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 6, 7, 0, 1};
        moveToEnd(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
