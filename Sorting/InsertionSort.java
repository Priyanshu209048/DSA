package com.Sorting;

//Time Complexity - O(N^2)
//Auxiliary Space Complexity - O(1)
public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 1, 3, 9, 4, 2};

        insertionSort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
