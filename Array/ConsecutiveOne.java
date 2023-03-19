package com.Array;

public class ConsecutiveOne {

//    static int getOne(int[] arr){
//        int res = 0;
//        for (int i = 0; i < arr.length; i++){
//            int count = 0;
//            for (int j = 0; j < arr.length; j++){
//                if (arr[i] == 1)
//                    count++;
//                else
//                    break;
//            }
//            res = Math.max(res, count);
//        }
//        return res;
//    }

    static int getOne(int[] arr){
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0)
                count = 0;
            else{
                count++;
                res = Math.max(count, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 1, 1, 0, 0, 1};

        int k = getOne(arr);
        System.out.println(k);
    }
}
