package com.Recursion;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(SumN(num1));
    }

    static int SumN(int n){
        if (n<0)
            return -1;
        return n+SumN(n-1);
    }
}
