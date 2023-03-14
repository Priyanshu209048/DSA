package com.Array;

import java.util.Scanner;

public class DeletionAtAnyPosition {

    public static int delete(int[] arr, int size, int key){
        int i=0;
        for (;i<size; i++){
            if (arr[i] == key)
                break;
        }

        if (i == size){
            return size;
        }

        for (int j=i; j<size-1; j++){
            arr[i] = arr[i+1];
        }

        return size-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();

        int value = 6;
        size = delete(arr, size, value);

        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
