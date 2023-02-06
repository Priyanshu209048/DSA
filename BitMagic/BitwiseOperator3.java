package com.BitMagic;

import java.util.Scanner;

public class BitwiseOperator3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        // Bitwise Signed Right Shift Operator  // x/2^y
//        System.out.println(x>>1);
//        System.out.println(x>>2);
//        System.out.println(x>>3);
//        System.out.println(x>>4);

        // Bitwise Unsigned Right Shift Operator
        System.out.println(x>>>1);
        System.out.println(x>>>2);
        System.out.println(x>>>3);
        System.out.println(x>>>4);
        System.out.println(y>>>1);
        System.out.println(y>>>2);
        System.out.println(y>>>3);
        System.out.println(y>>>4);
    }
}
