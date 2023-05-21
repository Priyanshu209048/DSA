package com.Sorting;

public class QuickSortUsingHoare {

    public static int hPartition(int[] arr, int low, int high){
        int p = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true){
            do {
                i++;
            }while (arr[i] < p);
            do {
                j--;
            }while (arr[j] > p);
            if (i >= j) return j;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    static void qSort(int[] arr, int low, int high){
        if (low < high){
            int n = hPartition(arr, low, high);
            qSort(arr, low, n);
            qSort(arr, n+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 13, 6, 12, 11, 8};
        qSort(arr, 0, arr.length-1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
