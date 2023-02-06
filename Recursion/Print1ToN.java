package com.Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        printNumber1(num1);
    }

    static void printNumber1(int n){
        if (n == 0)
            return;
        printNumber1(n-1);
        System.out.print(n + " ");
    }
}
