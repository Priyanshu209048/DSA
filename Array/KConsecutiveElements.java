package com.Array;

public class KConsecutiveElements {

//    static int maxSum(int[] arr, int k){
//        int res = Integer.MIN_VALUE;
//        for (int i = 0; i+k-1 < arr.length; i++){
//            int cur = 0;
//            for (int j = 0; j < k; j++){
//                cur += arr[i+j];
//            }
//            res = Math.max(res, cur);
//        }
//        return res;
//    }

    //Window Sliding Technique(Efficient Way)
    static int maxSum(int[] arr, int k){
        int cur = 0;
        for (int i = 0; i < k; i++){
            cur += arr[i];
        }
        int res = cur;
        for (int i = k; i < arr.length; i++){
            cur += arr[i] - arr[i-k];
            res = Math.max(cur, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, -2, 20, 1};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }
}
