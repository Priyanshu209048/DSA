package com.Sorting;

//Time Complexity - O(NLogN)
public class HeapSort {

    public static void buildHeap(int[] arr, int n){
        for (int i = n/2 - 1; i >= 0 ; i--) {
            heapify(arr, n, i);
        }
    }

    public static void sort(int[] arr, int n){
        buildHeap(arr, n);
        for (int i = n-1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i +1;
        int right = 2*i +2;
        if (left < n && arr[largest] < arr[left])
            largest = left;
        if (right < n && arr[largest] < arr[right])
            largest = right;

        if (largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        sort(arr, n);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
