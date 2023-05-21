package com.Sorting;

public class QuickSortUsingLomuto {

    public static int lPartition(int[] arr, int low, int high){
        int i = low;
        int p = arr[high];
        for (int j = low + 1; j <= high-1; j++) {
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

    static void qSort(int[] arr, int low, int high){
        if (low < high){
            int n = lPartition(arr, low, high);
            qSort(arr, low, n-1);
            qSort(arr, n+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 13, 6, 9, 12, 11, 8};
        qSort(arr, 0, arr.length-1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
