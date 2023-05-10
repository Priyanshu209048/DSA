package com.Sorting;

//It does not swap equal element this is the reason this is the stable sort
//Time Complexity - O(N^2)
//Auxiliary Space Complexity - O(1)

public class BubbleSort {

    /*static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }*/

    //Optimize Way
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 1, 3, 9, 4, 2};

        bubbleSort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
