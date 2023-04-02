package com.Matrix;

public class SearchInRowAndCol {

//    static void search(int[][] arr, int x){
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr.length; j++){
//                if (arr[i][j] == x){
//                    System.out.println("Found at (" + i + ", " + j + ")");
//                    return;
//                }
//            }
//        }
//        System.out.println("Not Found");
//    }

    //Efficient Way
    static void search(int[][] arr, int x){
        int i = 0, j = arr.length-1;
        while (i < arr.length && j >= 0){
            if (arr[i][j] == x){
                System.out.println("Found at (" + i + ", " + j + ")");
                return;
            } else if (arr[i][j] > x)
                j--;
            else
                i++;
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 45},
                       {32, 33, 39, 50}};
        int key = 35;
        search(arr,key);
    }
}
