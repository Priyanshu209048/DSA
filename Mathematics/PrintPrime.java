package com.Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        printPrime(num1);
    }

    static void printPrime(int n){
//        for (int i=2; i<=n; i++){
//            if (isPrime(i)){
//                System.out.println(i);
//            }
//        }

        //Sieve of Eratosthenes
        if (n <= 1)
            return;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i=2; i*i<=n; i++){
             if (isPrime[i]) {
                 for (int j = 2 * i; j <= n; j += i) {
                     isPrime[j] = false;
                 }
             }
        }
        for(int i = 2; i<=n; i++)
        {
            if(isPrime[i])
                System.out.print(i+" ");
        }
    }

//    static boolean isPrime(int a) {
//        if (a==1)
//            return false;
//        for (int i=2; i<a; i++){
//            if (a%i == 0)
//                return false;
//        }
//        return true;
//    }
}
