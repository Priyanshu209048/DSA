package com.Sorting;

//Time Complexity - O(N)
//Space Complexity - O(N)
//Stable
public class NaivePartition {

    public static void nPartition(int[] arr, int low, int high, int pivot){
        int[] temp = new int[high - low + 1];
        int index = 0;
        for (int i = 0; i < high; i++) {
            if (arr[i] <= arr[pivot]){
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[pivot];
        for (int i = 0; i < high; i++) {
            if (arr[i] > arr[pivot]){
                temp[index] = arr[i];
                index++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }

    public static void main(String[] args) {
        int[] arr = {5, 13, 6, 9, 12, 11, 8};
        nPartition(arr, 0, arr.length-1, arr.length-1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
