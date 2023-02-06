package com.Mathematics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(fact(number));
    }

    static int fact(int n){
        if (n < 0){
            return -1;
        } else if (n==0 || n==1 || n==2) {
            return n;
        } else {
            return fact(n-1)*n;
        }

//        int fa = 1;
//        for (int i=2; i<=n; i++){
//            fa *= i;
//        }
//        return fa;
    }
}
