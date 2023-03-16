package com.Array;

import java.util.Scanner;

public class CheckIfSorted {

//    static boolean isSorted(int[] arr){
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if (arr[i] > arr[j]){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    //Efficient Solution
    static boolean isSorted(int[] arr){
        for (int i=1; i< arr.length; i++){
            if (arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));
    }
}
