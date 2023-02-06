package com.Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(SumDigit(num1));
    }

    static int SumDigit(int n){
        if (n<10)
            return n;
        return n%10+SumDigit(n/10);
    }
}
