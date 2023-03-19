package com.Array;

public class LeadersInArray {

    static void leader(int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            boolean flag = false;
//            for (int j = i+1; j < arr.length; j++){
//                if (arr[i] <= arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag == false)
//                System.out.println(arr[i]);
//        }

        //Efficient Way
        int cur = arr[arr.length-1];
        System.out.println(cur);
//        int[] arr1;
//        int size = 1;
        for (int i = arr.length-2; i >= 0; i--){
            if (cur < arr[i]){
                cur = arr[i];
                System.out.println(cur);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        leader(arr);
    }
}
