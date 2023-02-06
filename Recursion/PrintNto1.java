package com.Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        printNumber(num1);
    }

    static void printNumber(int n){
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNumber(n-1);
    }
}
