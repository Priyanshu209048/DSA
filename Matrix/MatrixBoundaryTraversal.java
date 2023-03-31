package com.Matrix;

public class MatrixBoundaryTraversal {

    static void printBoundary(int[][] arr, int row, int col){
        if (row == 1) {
            for (int i = 0; i < row; i++)
                System.out.print(arr[0][i] + " ");
        }
        else if (col == 1) {
            for (int i = 0; i < col; i++)
                System.out.print(arr[i][0] + " ");
        }
        else {
            for (int i = 0; i < row; i++)
                System.out.print(arr[0][i] + " ");
            for (int i = 1; i < col; i++)
                System.out.print(arr[i][col-1] + " ");
            for (int i = col-2; i >= 0; i--)
                System.out.print(arr[row-1][i] + " ");
            for (int i = row-2; i >=1; i--)
                System.out.print(arr[i][0] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        printBoundary(arr, arr.length, arr.length);
    }
}
