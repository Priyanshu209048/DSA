package com.Matrix;

public class TransposeMatrix {

//    static void printTranspose(int[][] arr, int row, int col){
//        for (int i = 0; i < col; i++){
//            for (int j = 0; j < row; j++){
//                System.out.print(arr[j][i] + " "); //we can also print by storing it in a temp array
//            }
//            System.out.println();
//        }
//    }


    //Efficient way
    //Because it's traversing diagonally
    static void swap(int[][] arr, int i , int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static void printTranspose(int[][] arr, int row, int col){
        for (int i = 0; i < row; i++){
            for (int j = i+1; j < col; j++){
                swap(arr, i, j);
            }
        }

        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        printTranspose(arr, arr.length, arr.length);
    }
}
