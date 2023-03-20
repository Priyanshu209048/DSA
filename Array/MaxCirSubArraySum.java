package com.Array;

public class MaxCirSubArraySum {

//    static int maxSubArraySum(int[] arr){
//        int res = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            int max = arr[i];
//            int sum = arr[i];
//            for (int j = 1; j < arr.length; j++){
//                int index = (i+j)%arr.length;
//                sum += arr[index];
//                max = Math.max(max, sum);
//            }
//            res = Math.max(res, max);
//        }
//        return res;
//    }

    static int normalMaxSum(int[] arr){
        int res = arr[0], maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++){
            maxEnding = Math.max(maxEnding, maxEnding+arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    static int overallMaxSum(int[] arr){
        int maxNormal = normalMaxSum(arr);
        if (maxNormal < 0)
            return maxNormal;

        int sum = arr[0];
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = sum + normalMaxSum(arr);
        return Math.max(maxNormal, maxCircular);
    }

    public static void main(String[] args) {
//        int[] arr = {5, -2, 3, 4};
//        System.out.println(maxSubArraySum(arr));
        int[] arr = {5, -2, 3, 4};
        System.out.println(overallMaxSum(arr));
    }
}
