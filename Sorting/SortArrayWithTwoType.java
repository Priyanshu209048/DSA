package com.Sorting;

public class SortArrayWithTwoType {

    /*public static void sort(int[] arr){
        int[] temp = new int[arr.length];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] <= 0) {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                temp[i] = arr[j];
                i++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }*/

    public static int sort(int[] arr, int low, int high){
        int i = low-1;
        int j = high+1;
        while (true){
            do {
                i++;
            }while (arr[i] <= 0);
            do {
                j--;
            }while (arr[j] > 0);
            if (i >= j) return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {15, -3, -2, 18};
        //sort(arr, arr.length);
        sort(arr, 0, arr.length-1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
