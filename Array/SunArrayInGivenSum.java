package com.Array;

public class SunArrayInGivenSum {

//    static boolean isSubArray(int[] arr, int sum){
//        for (int i = 0; i < arr.length; i++){
//            int cur = 0;
//            for (int j = i; j < arr.length; j++){
//                cur += arr[i];
//                if (sum == cur)
//                    return true;
//            }
//        }
//        return false;
//    }

    //Efficient way
//    static boolean isSubArray(int[] arr, int sum){
//        int cur = 0;
//        for (int i = 0; i < arr.length; i++){
//            cur += arr[i];
//            if (cur > sum)
//                break;
//        }
//        for (int i = 0; i < arr.length; i++){
//            cur -= arr[i];
//            if (cur == sum)
//                return true;
//        }
//        return false;
//    }
    //OR
    static boolean isSubArray(int[] arr, int sum){
        int s = 0, cur = 0;
        for (int i = 0; i < arr.length; i++){
            cur += arr[i];
            while(cur > sum){
                cur -= arr[s];
                s++;
            }
            if (sum == cur)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        System.out.println(isSubArray(arr, sum));
    }
}
