package com.Searching;

public class FindPeakElement {

    /*public static int getPeak(int[] arr){
        if (arr.length == 1)
            return arr[0];
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[arr.length-1] >= arr[arr.length-2])
            return arr[arr.length-1];

        for (int i = 1; i < arr.length-1; i++){
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                return arr[i];
        }
        return -1;
    }*/

    //Efficient Way
    public static int getPeak(int[] arr){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if ((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == arr.length-1 || arr[mid] >= arr[mid+1]))
                return mid;
            if (mid > 0 && arr[mid] < arr[mid-1])
                high = mid -1;
            else
                low = mid +1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15, 7, 10, 1};
        System.out.println(getPeak(arr));
    }
}
