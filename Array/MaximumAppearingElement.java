package com.Array;

public class MaximumAppearingElement {

//    static int maxAppear(int[] left, int[] right){
//        int[] freq = new int[100];
//        for (int i = 0; i < 3; i++) {
//            for (int j = left[i]; j < right[i]; j++)
//                freq[i] += 1;
//        }
//
//        int res = 0;
//        for (int i = 1; i < freq.length; i++){
//            if (freq[i] > freq[res])
//                res = i;
//        }
//        return res;
//    }

    //Efficient Way
    static int MAX = 1000000;
    static int maxAppear(int[] left, int[] right){
        int[] arr = new int[MAX];
        int max = -1;
        for (int i = 0; i < left.length; i++){
            arr[left[i]]++;
            arr[right[i]+1]--;
            if (right[i] > max)
                max = right[i];
        }

        int mSum = arr[0];
        int ind = 0;
        for (int i = 1; i < max; i++){
            arr[i] += arr[i-1];
            if (mSum < arr[i]){
                mSum = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 7};
        System.out.println(maxAppear(left, right));
    }
}
