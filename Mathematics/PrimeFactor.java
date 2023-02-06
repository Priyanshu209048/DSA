package com.Mathematics;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        primeFactors(num1);
    }

    static void primeFactors(int n){
//        for (int i=2; i<=n; i++){
//            if (isPrime(i)){
//                int x = i;
//                while (n%x == 0){
//                    System.out.println(i);
//                    x *= i;
//                }
//            }
//        }

        //Efficient Way
//        if (n<=1)
//            return;
//        for (int i=2; i*i<=n; i++){
//            while (n%i == 0){
//                System.out.println(i + " ");
//                n /= i;
//            }
//        }
//        if (n>1)
//            System.out.print(n + "");
//        System.out.println();

        //More Efficient Way
        if (n<=1)
            return;
        while (n%2 == 0){
            System.out.println(2);
            n /= 2;
        }
        while (n%3 == 0){
            System.out.println(3);
            n /= 3;
        }
        for (int i=5; i*i<=n; i+=6){
            while (n%i == 0) {
                System.out.println(i);
                n /= i;
            }
            while (n%(i+2)==0) {
                System.out.println(i + 2);
                n /= (i + 2);
            }
        }
        if (n>3){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static boolean isPrime(int a){
    if (a == 1)
            return false;
        if (a == 2 || a == 3)
            return true;
        if (a%2 == 0 || a%3 == 0)
            return false;
        for (int i=5; i*i<=a; i+=6){
        if (a%i==0 || a%(i+1) == 0)
            return false;
    }
        return true;
    }
}
