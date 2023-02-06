package com.BitMagic;

import java.util.Scanner;

public class CountSetBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        countSetBit(a);
    }

    static void countSetBit(int n){
//        int res = 0;
//        while (n>0){
//            if (n%2 == 1)   //We can replace
//                res++;      //this statement with res = res+(n&1)
//            n = n>>1;
//        }
//        System.out.println(res);

        //Brian and Kerningham Algorithm
        int res = 0;
        while (n>0){
            n = n & (n-1);
            res++;
        }
        System.out.println(res);
    }
}
