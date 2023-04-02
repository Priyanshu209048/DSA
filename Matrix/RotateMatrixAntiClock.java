package com.Matrix;

public class RotateMatrixAntiClock {

    static int n = 4;
//    static void rotate90(int[][] arr){
//        int[][] temp = new int[n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                temp[n-j-1][i] = arr[i][j];
//            }
//        }
//        for (int i = 0; i < n; i++){
//            System.arraycopy(temp[i], 0, arr[i], 0, n);
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    //Efficient way
    static void swap(int[][] arr, int i , int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    static void swap2(int low, int high, int i, int[][] mat)
    {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }

    static void rotate90(int[][] arr){
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                swap(arr, i, j);
            }
        }
        for (int i = 0; i < n; i++){
            int low = 0, high = n-1;
            while (low < high){
                swap2(low, high, i, arr);
                low++;
                high--;
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
        rotate90(arr);
    }
}
