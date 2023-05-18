package com.Sorting;

public class MergeTwoSortedArray {

    public static void merge(int[] arr1, int[] arr2, int n, int m){
        int i = 0, j = 0;
        int[] c = new int[m+n];
        while (i < n && j < m){
            if (arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while (i < n){
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (i < m){
            System.out.print(arr2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2, arr1.length, arr2.length);

    }
}
