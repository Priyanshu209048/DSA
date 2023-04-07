package com.Searching;

public class IndexOfLastOccurrenceSorted {

    //Efficient Way(Recursion)
    /*public static int lastOccurrence(int[] arr, int value, int low, int high){
        if (low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] > value)
            return firstOccurrence(arr, value, low, mid-1);
        else if (arr[mid] < value)
            return firstOccurrence(arr, value, mid+1, high);
        else {
            if (mid == arr.length-1 || arr[mid] != arr[mid+1])
                return mid;
            else
                return firstOccurrence(arr, value, low, mid+1);
        }
    }*/

    //Efficient Way(Iterative)
    public static int lastOccurrence(int[] arr, int value){
        int start = 0, end = arr.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] > value){
                end = mid - 1;
            } else if (arr[mid] < value){
                start = mid + 1;
            } else {
                if (mid == arr.length-1 || arr[mid+1] != arr[mid])
                    return mid;
                else
                    end = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 10, 10, 20, 20, 30};
        int value = 10;
        //System.out.println(lastOccurrence(arr, value, 0, arr.length-1));
        System.out.println(lastOccurrence(arr, value));
    }
}
