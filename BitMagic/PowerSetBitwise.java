package com.BitMagic;

import java.util.Scanner;

public class PowerSetBitwise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "abc";
        printPower(s);
    }

    static void printPower(String str){
        int n = str.length();
        int powSize = (int) Math.pow(2,n);
        for (int i=0; i<powSize; i++){
            for (int j=0; j<n; j++){
                if ((i & (1<<j)) != 0)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
