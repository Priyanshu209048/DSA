package com.Array;

import java.util.Scanner;

public class RemoveDuplicateInSorted {

    static int remDup(int[] arr, int size){
        //Using Auxiliary space
//        int[] temp = new int[size];
//        temp[0] = arr[0];
//        int res = 1;
//        for (int i = 1; i < size; i++){
//            if (temp[res-1] != arr[i]){
//                temp[res] = arr[i];
//                res++;
//            }
//        }
//        for (int i = 0; i < res; i++){
//            arr[i] = temp[i];
//        }
//        return res;

        //without using Auxiliary space
        int res = 1;
        for (int i = 1; i < size; i++){
            if (arr[res-1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        size = remDup(arr, size);
        System.out.println("Array after removing duplicate element...");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
