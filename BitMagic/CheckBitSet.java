package com.BitMagic;

import java.util.Scanner;

public class CheckBitSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        isSet(a, b);
    }

    static void isSet(int n, int k){
//        int x = 1;
//        for (int i=0; i<(k-1); i++)
//            x *= 2;   // or x >>= 2
//        if ((n & x) != 0){  //or n & 1
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        //Using Left Shift
//        int x = (1<<(k-1));
//        if ((n & x) != 0){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        //Using Right Shift
        int x = (n>>(k-1));
        if ((n & x) != 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
