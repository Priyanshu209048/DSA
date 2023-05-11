package com.Sorting;

public class CountInversionInArray {

    /*public static int inversion(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    res++;
            }
        }
        return res;
    }*/

    public static int merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + low];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int res = 0;
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                k++; i++;
            } else {
                arr[k] = right[j];
                k++; j++;
                res += n1-i;
            }
        }
        while (i < n1){
            arr[k] = left[i];
            k++; i++;
        }
        while (j < n2){
            arr[k] = right[j];
            k++; j++;
        }
        return res;
    }

    public static int inversion(int [] arr, int low, int high){
        int res = 0;
        if (high > low){
            int mid = (low + high) / 2;
            res += inversion(arr, low, mid);
            res += inversion(arr, mid+1, high);
            res += merge(arr, low, mid, high);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 7, 3, 4};
//        int n = inversion(arr);
//        System.out.println(n);

        int n = inversion(arr, 0, arr.length-1);
        System.out.println(n);

    }
}
