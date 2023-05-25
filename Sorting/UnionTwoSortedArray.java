package com.Sorting;

import java.util.Arrays;

//Time Complexity - O(N+M)
public class UnionTwoSortedArray {

    /*public static void union(int[] arr1, int[] arr2, int n, int m){
        int[] c = new int[n+m];
        for (int i = 0; i < n; i++) {
            c[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            c[i+n] = arr2[i];
        }

        Arrays.sort(c);

        for (int i = 0; i < n+m; i++) {
            if (i == 0 || c[i] != c[i-1])
                System.out.print(c[i] + " ");
        }
    }*/

    public static void union(int[] arr1, int[] arr2, int n, int m){
        int i = 0, j = 0;
        while (i < n && j < m){
            if (i > 0 && arr1[i-1] == arr1[i]){
                i++; continue;
            }
            if (j > 0 && arr2[j-1] == arr2[j]){
                j++; continue;
            }
            if (arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++; j++;
            }
        }
        while (i < n){
            if (i == 0 || arr1[i] != arr1[i-1])
                System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < m){
            if (j == 0 || arr2[j] != arr2[j-1])
                System.out.print(arr2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {1, 3, 5, 7, 9};

        union(arr1, arr2, arr1.length, arr2.length);
    }
}
