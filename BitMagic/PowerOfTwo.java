package com.BitMagic;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(power2(num1));
    }

    static boolean power2(int n){
//        if (n == 0)
//            return false;
//        while (n != 1){
//            if (n%2 != 0)
//                return false;
//            n /= 2;
//        }
//        return true;

        //Efficient way(Brian and Kerningham Algorithm)
        if (n == 0)
            return false;
        return ((n&(n-1)) == 0);
    }
}
