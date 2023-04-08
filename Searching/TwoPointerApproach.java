package com.Searching;

public class TwoPointerApproach {

    /*public static boolean isPair(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[i] + arr[j] == sum)
                    return true;
            }
        }
        return false;
    }*/

    //Efficient Way
    public static boolean isPair(int[] arr, int sum){
        int low = 0, high = arr.length-1;
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

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 9 , 11, 12, 20, 30};
        int sum = 23;
        System.out.println(isPair(arr, sum));
    }
}
