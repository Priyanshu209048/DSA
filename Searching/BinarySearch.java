package com.Searching;

import java.util.Scanner;

//Time Complexity = O(LogN)
public class BinarySearch {

    public static void binarySearch(int[] arr, int value){
        int start = 0, end = arr.length-1;
        int mid = (start + end) / 2;
        System.out.println(start + " " + mid + " " + end);

        while (arr[mid] != value && start <= end){
            if (value > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
            System.out.println(start + " " + mid + " " + end);
        }

        if(arr[mid] == value) {
            System.out.println("The element is found at the index " +  mid);
        }else {
            System.out.println("The element " + value + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 4;
        binarySearch(arr, value);

        sc.close();
    }
}
