package com.Sorting;

//Time Complexity - O(NLogN)
//Auxiliary Space Complexity - O(N)
public class MergeSort1 {
    public static void conquer(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= high){
            if (arr[idx1] <= arr[idx2]){
                temp[x] = arr[idx1];
                x++; idx1++;
            } else{
                temp[x] = arr[idx2];
                x++; idx2++;
            }
        }
        while(idx1 <= mid){
            temp[x] = arr[idx1];
            x++; idx1++;
        }
        while (idx2 <= high){
            temp[x] = arr[idx2];
            x++; idx2++;
        }

        for (int i = 0, j = low; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void divide(int[] arr, int low, int high){
        if (high <= low){
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        conquer(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 1, 3, 9, 4, 2};

        divide(arr, 0, arr.length-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
