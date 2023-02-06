package com.Mathematics;

import java.util.Scanner;

public class IterativePower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(power(num1, num2));
    }

    static int power(int a, int b){
        int res = 1;
        while (b>0){
            if (b%2 != 0)
                res = res * a;
            a = a * a;
            b = b>>1;    // b/2
        }
        return res;
    }
}
