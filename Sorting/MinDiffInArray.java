package com.Sorting;

import java.util.Arrays;

public class MinDiffInArray {

    /*public static int minDiff(int[] arr, int n){
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
        }
        return res;
    }*/

    //Efficient Way O(NLogN)
    public static int minDiff(int[] arr, int n){
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res = Math.min(res, Math.abs(arr[i] - arr[i-1]));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 4};

        System.out.println(minDiff(arr, arr.length));
    }
}
