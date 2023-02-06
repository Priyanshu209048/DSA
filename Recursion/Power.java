package com.Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(power(num1, num2));
    }

    static int power(int base, int exp){
        if (exp == 0)
            return 1;
        return base * power(base, exp-1);
    }
}
