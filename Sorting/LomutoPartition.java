package com.Sorting;

//Time Complexity - O(N)
//Auxiliary Space Complexity - O(1)
//Best unsorted partition Algorithm
public class LomutoPartition {

    public static int lPartition(int[] arr, int low, int high){
        int i = low;    //Also write it as i = low - 1
        int p = arr[high];
        for (int j = 1; j <= high-1; j++) {
            if (arr[j] < p){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 13, 6, 9, 12, 11, 8}; //O/P - 5 6 8 9 12 11 13
        lPartition(arr, 0, arr.length-1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
