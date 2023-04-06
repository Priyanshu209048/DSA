package com.Searching;

public class CountOccurrenceInSorted {

    /*public static int countOccurrence(int[] arr, int value){
        int count = 0;
        for (int j : arr) {
            if (j == value)
                count++;
        }
        return count;
    }*/

    //Efficient Way
    public static int lastOcc(int[] arr, int value){
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
    public static int firstOcc(int[] arr, int value){
        int start = 0, end = arr.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] > value){
                end = mid - 1;
            } else if (arr[mid] < value){
                start = mid + 1;
            } else {
                if (mid == 0 || arr[mid-1] != arr[mid])
                    return mid;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
    public static int countOccurrence(int[] arr, int value){
        int first = firstOcc(arr, value);
        if (first == -1)
            return 0;
        else
            return lastOcc(arr, value) - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 10, 10, 20, 20, 30};
        int value = 10;
        System.out.println(countOccurrence(arr, value));
    }
}
