package com.Array;

public class MaximumSumSubArray {

//    static int maxSum(int[] arr){
//        int res = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            int curr = 0;
//            for (int j = i; j < arr.length; j++){
//                curr += arr[j];
//                res = Math.max(curr, res);
//            }
//        }
//        return res;
//    }

    static int maxSum(int[] arr){
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -1, 2};
        System.out.println(maxSum(arr));

        System.out.println();

        int[] arr1 = {-3, 8, -2, 4, -5, 6};
        System.out.println(maxSum(arr));
    }
}
