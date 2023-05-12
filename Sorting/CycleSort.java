package com.Sorting;

public class CycleSort {

    public static void cycleSort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            int item = arr[i];
            int pos = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < item)
                    pos++;
            }
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (i != pos){
                pos = i;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] < item)
                        pos++;
                }
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 10, 30};
        int n = arr.length;
        cycleSort(arr, n);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
