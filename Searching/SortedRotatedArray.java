package com.Searching;

public class SortedRotatedArray {

    /*public static int search(int[] arr, int value){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value)
                return i;
        }
        return -1;
    }*/

    //Efficient Way
    public static int search(int[] arr, int value){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[low] <= arr[mid]){
                if (value >= arr[low] && value < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (value >= arr[mid] && value < arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 8, 9};
        int value = 40;
        System.out.println(search(arr, value));
    }
}
