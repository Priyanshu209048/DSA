package com.BitMagic;

import java.util.Scanner;

public class BitwiseOperator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        // Bitwise NOT Operator3
        System.out.println(~x);
        System.out.println(~y);

        // Bitwise Left Shift Operator  // x*2^y
        System.out.println(x<<1);
        System.out.println(x<<2);
        System.out.println(x<<3);
        System.out.println(x<<y);
    }
}
