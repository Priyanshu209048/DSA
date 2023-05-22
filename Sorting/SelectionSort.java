package com.Sorting;

//Time Complexity - O(N^2)
//Auxiliary Space Complexity - O(1)
//It is not stable sort if we se the array {90, 80, 90, 25}

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
            if (arr[minIndex] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 1, 3, 9, 4, 2};

        selectionSort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
