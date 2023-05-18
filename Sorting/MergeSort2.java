package com.Sorting;

//Time Complexity - O(NLogN)
//Auxiliary Space Complexity - O(N)
public class MergeSort2 {
    public static void conquer2(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + low];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                k++; i++;
            } else {
                arr[k] = right[j];
                k++; j++;
            }
        }
        while (i < n1){
            arr[k] = left[i];
            k++; i++;
        }
        while (j < n2){
            arr[k] = right[j];
            k++; j++;
        }
    }

    public static void divide2(int[] arr, int low, int high){
        if (high <= low){
            return;
        }
        int mid = low + (high - low) / 2;
        divide2(arr, low, mid);
        divide2(arr, mid+1, high);
        conquer2(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 1, 3, 9, 4, 2};

        divide2(arr, 0, arr.length-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
