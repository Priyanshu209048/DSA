package com.Sorting;

public class SortArrayWithThreeType {

    /*public static void sort(int[] arr, int n){
        int[] temp = new int[arr.length];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 2) {
                temp[i] = arr[j];
                i++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }*/

    public static void sort(int[] arr, int n){
        int low = 0, mid = 0, high = n-1;
        while (mid <= high){
            if (arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++; mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 0, 1, 1, 2};
        sort(arr, arr.length);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
