package com.Array;

public class EquilibriumPoint {

//    static boolean ePoint(int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            int ls = 0, rs = 0;
//            for (int j = 0; j < i; j++)
//                ls += arr[j];
//            for (int k = i+1; k < arr.length; k++)
//                rs += arr[k];
//            if (ls == rs)
//                return true;
//        }
//        return false;
//    }

    //Efficient Way
    static boolean ePoint(int[] arr){
        int rs = 0;
        for (int j : arr)
            rs += j;
        int ls = 0;
        for (int i = 0; i < arr.length; i++){
            rs -= arr[i];
            if (ls == rs)
                return true;
            ls += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 9, 7};
        System.out.println(ePoint(arr));
    }
}
