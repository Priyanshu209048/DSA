package com.Recursion;

import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(subSum(arr, n, sum));
    }

    static int subSum(int[] arr, int n, int sum){
        if (n == 0)
            return sum == 0? 1 : 0;
        return subSum(arr, n-1, sum) + subSum(arr, n-1, sum-arr[n-1]);
    }
}
