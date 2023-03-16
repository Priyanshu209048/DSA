package com.Array;

public class FrequenciesInSortedArray {

    public static void printFreq(int[] arr){
        int freq = 1, i = 1;
        while (i < arr.length){
            while (i < arr.length && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;
        }
        if (arr.length == 1 || arr[arr.length-1] != arr[arr.length-2]){
            System.out.println(arr[arr.length-1] + " " + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 20, 30};
        printFreq(arr);

        System.out.println(" ");

        int[] arr1 = {10, 20, 20, 20};
        printFreq(arr1);
    }
}
