package com.Sorting;

import java.util.Arrays;

public class KthSmallestElement {

    /*public static int kthSmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }*/

    //Efficient Way
    public static int lPartition(int[] arr, int low, int high){
        int i = low;    //Also write it as i = low - 1
        int p = arr[high];
        for (int j = 1; j <= high-1; j++) {
            if (arr[j] < p){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static int kthSmallest(int[] arr,int n, int k){
        int l = 0, r = n-1;
        while (l <= r){
            int p = lPartition(arr, l, r);
            if (p == k-1)
                return arr[p];
            else if (p > k-1)
                r = p-1;
            else
                l = p+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 13, 6, 12, 11, 8};
        int k = 5;

        System.out.println(kthSmallest(arr, arr.length, k));
    }
}
