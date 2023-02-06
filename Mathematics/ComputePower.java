package com.Mathematics;

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(power(num1, num2));
    }

    static int power(int a, int b){
//        return (int) Math.pow(a,b);

        //OR
//        int res = 1;
//        for (int i=0; i<b; i++){
//            res *= a;
//        }
//        return res;

        //Efficient Way
        if (b == 0)
            return 1;
        int temp = power(a, b/2);
        temp = temp * temp;
        if (b%2 == 0)
            return temp;
        else
            return temp * a;
    }
}
