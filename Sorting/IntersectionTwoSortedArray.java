package com.Sorting;

public class IntersectionTwoSortedArray {

    /*public static void intersection(int[] arr1, int[] arr2, int n, int m){
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr1[i] == arr1[i-1])
                continue;
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }*/

    //Efficient Way
    public static void intersection(int[] arr1, int[] arr2, int n, int m){
        int i = 0, j = 0;
        while (i < n && j < m){
            if (i > 0 && arr1[i-1] == arr1[i]){
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) i++;
            else if (arr1[i] > arr2[j]) j++;
            else {
                System.out.print(arr1[i] + " ");
                i++; j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 5, 8};

        intersection(arr1, arr2, arr1.length, arr2.length);
    }
}
