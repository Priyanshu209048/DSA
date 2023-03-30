package com.Array;

public class TrappingRainWater {

//    static int getWater(int[] arr){
//        int res = 0;
//        for (int i = 1; i < arr.length-1; i++){
//            int lmax = arr[i];
//            for (int j = 0; j < i; j++){
//                lmax = Math.max(lmax, arr[j]);
//            }
//
//            int rmax = arr[i];
//            for (int j = i+1; j < arr.length; j++){
//                rmax = Math.max(rmax, arr[j]);
//            }
//
//            res += (Math.min(lmax, rmax) - arr[i]);
//        }
//        return res;
//    }

    static int getWater(int[] arr){
        int res = 0;
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        lmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        rmax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i > 0; i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }

        for (int i = 1  ; i < arr.length-1; i++){
            res += (Math.min(lmax[i], rmax[i]) - arr[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2, 5};
        System.out.println(getWater(arr));

        System.out.println();

        int[] arr1 = {3, 5, 2, 3};
        System.out.println(getWater(arr1));
    }
}
