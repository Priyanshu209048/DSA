package com.Searching;

public class BinarySearchUsingRecursion {

    public static int binarySearch2(int[] arr, int low, int high, int value) {
        if (low > high) {
            System.out.println(value + "Not Found");
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == value){
            System.out.print("The element is found at the index ");
            return mid;
        } else if (arr[mid] > value) {
            return binarySearch2(arr, low, mid-1, value);
        } else
            return binarySearch2(arr, mid+1, high, value);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0, end = arr.length-1;
        int value = 5;

        System.out.println(binarySearch2(arr, start, end, value));
    }
}
