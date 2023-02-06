package com.Recursion;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(BinToDec(num1));
    }

    static int BinToDec(int n){
        if (n == 0)
            return 0;
        else
            return n%2 + 10*BinToDec(n/2);
    }
}
