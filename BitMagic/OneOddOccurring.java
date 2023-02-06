package com.BitMagic;

import java.util.Scanner;

public class OneOddOccurring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = {4, 3, 4, 4, 4, 5, 5, 3, 3};
        int size = A.length;
        System.out.println(findOdd(A, size));
    }

    static int findOdd(int[] arr, int n){
//        for (int i=0; i<n; i++){
//            int count = 0;
//            for (int j=0; j<n;j++) {
//                if (arr[i] == arr[j])
//                    count++;
//            }
//            if (count%2 != 0)
//                return arr[i];
//        }
//        return 0;

        //Efficient Way
        int res = arr[0];
        for (int i=1; i<n; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
