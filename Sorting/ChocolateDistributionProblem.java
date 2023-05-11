package com.Sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int minDiff(int[] arr, int m, int n){
        if (m > n)
            return -1;
        Arrays.sort(arr); //arr = {2, 3, 4, 7, 9, 12, 56}
        int res = arr[m-1] - arr[0];
        for (int i = 0; i + m-1 < n; i++) {
            Math.min(res, arr[i+m-1] - arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(minDiff(arr, m, arr.length));
    }
}
