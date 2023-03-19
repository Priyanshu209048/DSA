package com.Array;

public class LongestEvenOddSubArray {

//    static int maxEvenOdd(int[] arr){
//        int res = 1;
//        for (int i = 0; i < arr.length; i++){
//            int cur = 1;
//            for (int j = i+1; j < arr.length; j++){
//                if ((arr[j]%2 != 0 && arr[j-1]%2 == 0) || (arr[j]%2 == 0 && arr[j-1]%2 != 0))
//                    cur++;
//                else
//                    break;
//            }
//            res = Math.max(res, cur);
//        }
//        return res;
//    }

    static int maxEvenOdd(int[] arr){
        int res = 1;
        int cur = 1;
        for (int i = 1; i < arr.length; i++){
            if ((arr[i]%2 != 0 && arr[i-1]%2 == 0) || (arr[i]%2 == 0 && arr[i-1]%2 != 0)){
                cur++;
                res = Math.max(res, cur);
            }else
                cur = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr= {5, 10, 20, 6, 3, 8};
        System.out.println(maxEvenOdd(arr));
    }
}
