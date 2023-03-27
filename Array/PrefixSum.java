package com.Array;

public class PrefixSum {

//    static int getSum(int[] arr, int l, int r){
//        int res = 0;
//        for (int i = l; i <= r; i++){
//            res += arr[i];
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 8, 3, 9, 6, 5, 4};
//        int l = 1, k = 3;
//        System.out.println(getSum(arr, l, k));
//    }

    //Efficient Way
    static int getSum(int[] arr, int l, int r){
        if (l == 0)
            return arr[r];
        return arr[r] - arr[l-1];
    }
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int l = 1, k = 3;

        int[] arr1 = new int[arr.length];
        arr1[0] = arr[0];
        for (int i = 1; i < arr1.length; i++){
            arr1[i] = arr1[i-1] + arr[i];
        }
        System.out.println(getSum(arr1, l, k));

    }
}
