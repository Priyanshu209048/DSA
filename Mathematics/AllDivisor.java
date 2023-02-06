package com.Mathematics;

import java.util.Scanner;

public class AllDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        divisor(num1);
    }

    static void divisor(int n){
//        for (int i=1; i<=n; i++){
//            if (n%i == 0)
//                System.out.println(i);
//        }

        //Efficient Way
//        for (int i=1; i*i<=n; i++){
//            if (n%i == 0){
//                System.out.println(i);
//                if (i != n/i){
//                    System.out.println(n/i);
//                }
//            }
//        }

        //Efficient Way in sorted order
        int i;
        for (i=1; i*i<n; i++){
            if (n%i == 0){
                System.out.println(i);
            }
        }
        for (; i>=1; i--){
            if (n%i ==0){
                System.out.println(n/i);
            }
        }
    }
}
