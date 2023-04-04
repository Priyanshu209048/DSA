package com.Searching;

import java.util.Scanner;

//Time Complexity = O(LogN)
public class BinarySearch1 {

    public static int binarySearch1(int[] arr, int value){
        int start = 0, end = arr.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (arr[mid] == value){
                System.out.print("The element " + value + " is found at the index ");
                return mid;
            } else if(arr[mid] > value){
                end = mid-1;
            } else {
                start = mid +1;
            }
        }

        System.out.println("The element " + value + " not found.");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = sc.nextInt();
        System.out.println(binarySearch1(arr, value));

        sc.close();
    }
}
