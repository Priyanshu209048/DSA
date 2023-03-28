package com.Array;

import java.util.Scanner;

public class ReverseArray {

    static void reverse(int[] arr, int size){
        //Using For loop
//        int[] arr1 = new int[size];
//        int j = size;
//        for (int i=0; i<size; i++){
//            arr1[j-1] = arr[i];
//            j -= 1;
//        }

        //Using While Loop
        int low = 0, high = size-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++; high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before reverse...");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        reverse(arr, size);
        System.out.println("Array After reverse...");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
