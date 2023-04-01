package com.Matrix;

import java.util.Arrays;

//Median of a Row-Wise odd size Sorted Array
public class MedianOfMatrix {
    static int median(int[][] arr, int row, int col){
        int min = arr[0][0], max = arr[0][col-1];
        for (int i = 1; i < row; i++){
            if (arr[i][0] < min)
                min = arr[i][0];
            if (arr[i][col-1] > max)
                max = arr[i][col-1];
        }

        int medPos = (row * col + 1)/2;
        while (min < max){
            int mid = (min + max )/2;
            int midPos = 0;
            for (int i = 0; i < row; i++){
                int pos = Arrays.binarySearch(arr[i], mid) + 1;
                midPos += Math.abs(pos);
            }
            if (midPos < medPos)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 10, 20},
                       {15, 25, 30},
                       {5, 8, 40}};
        System.out.println(median(arr, 3, 3));
    }
}
