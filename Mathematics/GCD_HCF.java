package com.Mathematics;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(gcd(num1,num2));
    }

    static int gcd(int a, int b){
//        int res = Math.min(a,b);
//        while (res>0){
//            if (a%res == 0 && b%res == 0){
//                break;
//            }
//            res--;
//        }
//        return res;


        //Efficient Way
        //Euclidean Algorithm
//        while (a != b){
//            if (a > b){
//                a -= b;
//            } else if (b > a) {
//                b -= a;
//            }
//        }
//        return a;

        if (b == 0){
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}
