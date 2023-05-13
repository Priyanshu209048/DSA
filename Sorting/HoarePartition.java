package com.Sorting;

//Time Complexity - O(NLogN)
//Auxiliary Space - O(1)
public class HoarePartition {

    public static int hPartition(int[] arr, int low, int high){
        int p = arr[low];
        int i = low - 1;    //We can not write it as i = low - 1
        int j = high + 1;   //We can not write it as j = high + 1

        while (true){
            do {
                i++;
            }while (arr[i] < p);
            do {
                j--;
            }while (arr[j] > p);
            if (i >= j) return j;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 13, 6, 12, 11, 8}; //O/P - 8 5 6 13 12 11 9
        hPartition(arr, 0, arr.length-1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
