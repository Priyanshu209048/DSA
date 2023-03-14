package com.Array;

import java.util.Scanner;

public class InsertionAtAnyPosition {

    public static int insert(int[] arr, int cap, int size, int pos, int key){
        if (cap == size){
            return size;
        }

        int index = pos-1;
        for (int i=size-1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = key;

        return size+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = 5, size = 3;
        int[] arr = new int[cap];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();

        int pos = 1;
        int key = 6;
        size = insert(arr, cap, size, pos, key);

        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
