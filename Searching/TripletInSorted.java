package com.Searching;

public class TripletInSorted {

    /*public static boolean isTriplet(int[] arr, int value){
        for (int i = 0; i < arr.length-2; i++){
            for (int j = i+1; j < arr.length-1; j++){
                for (int k = j+1; k < arr.length; k++){
                    if (arr[i] + arr[j] + arr[k] == value)
                        return true;
                }
            }
        }
        return false;
    }*/

    //Efficient Way
    public static boolean isPair(int[] arr, int sum, int s1){
        int low = s1, high = arr.length-1;
        while (low <= high){
            if (arr[low]+arr[high] == sum)
                return true;
            else if (arr[low] + arr[high] > sum)
                high--;
            else
                low++;
        }
        return false;
    }
    public static boolean isTriplet(int[] arr, int value){
        for (int i = 0; i <arr.length-2; i++){
            if (isPair(arr, value - arr[i], i+1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 8, 9, 20, 40};
        int value = 32;
        System.out.println(isTriplet(arr, value));
    }
}
