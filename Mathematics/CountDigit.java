package com.Mathematics;

import java.util.Scanner;

public class CountDigit {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
        System.out.println(Count(digit));
    }

    static int Count(int num){
        while (num > 0){
            num/=10;
                count++;
        }
        return count;

//        if (num > 0){
//            count ++;
//            Count(num/10);
//        }
//        return count;
    }
}
