package com.Searching;

import java.util.Scanner;

//Time Complexity = O(N).
public class LinearSearch {

    public static void linearSearch(int[] arr, int value){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value) {
                System.out.println(value + " Found in an array, At the index " + i);
                return;
            }
        }
        System.out.println(value + "Not Found in an array...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{5, 3, 8, 7, 9, 4, 6, 1, 0, 2};
        System.out.print("Enter Element to be searched...  ");
        int key = sc.nextInt();
        linearSearch(arr, key);

        sc.close();
    }
}
