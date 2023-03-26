package com.Array;

public class MinimumConsecutiveFlips {

    static void minFlips(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i-1]){
                if (arr[i] != arr[0])
                    System.out.print("From " + i + " to ");
                else
                    System.out.println(i-1);
            }
        }
        if (arr[arr.length-1] != arr[0])
            System.out.print(arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 0, 1};
        minFlips(arr);
    }
}
