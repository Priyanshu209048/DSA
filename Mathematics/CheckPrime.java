package com.Mathematics;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(isPrime(num1));
    }

    static boolean isPrime(int a){
//        if (a==1)
//            return false;
//        for (int i=2; i<a; i++){
//            if (a%i == 0)
//                return false;
//        }
//        return true;

        //Efficient Way
//        if (a == 1)
//            return false;
//        for (int i=2; i*i<a; i++){
//            if (a%i == 0)
//                return false;
//        }
//        return true;

        //More Efficient Way (For Larger Way)
        if (a == 1)
            return false;
        if (a == 2 || a == 3)
            return true;
        if (a%2 == 0 || a%3 == 0)
            return false;
        for (int i=5; i*i<=a; i+=6){
            if (a%i==0 || a%(i+2) == 0)
                return false;
        }
        return true;
    }
}
