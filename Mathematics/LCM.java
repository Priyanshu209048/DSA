package com.Mathematics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        gcd(num1, num2);
        System.out.println(lcm(num1, num2));
    }

//    static int lcm(int a, int b){
//        int res = Math.max(a,b);
//        while (res > 0){
//            if (res%a == 0 && res%b == 0){
//                break;
//            }
//            res++;
//        }
//        return res;
//    }

    //Efficient Way
    static int gcd(int a, int b){
        if (b == 0){
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
