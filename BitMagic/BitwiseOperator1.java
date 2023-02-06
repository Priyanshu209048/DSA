package com.BitMagic;

import java.util.Scanner;

public class BitwiseOperator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a&b);  // Bitwise AND Operator
        System.out.println(a|b);  // Bitwise OR Operator
        System.out.println(a^b);  // Bitwise XOR Operator
    }
}
