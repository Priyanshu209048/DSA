package com.Mathematics;

import java.util.Scanner;

public class ZeroInFact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(factZero(number));
    }

    static int factZero(int n){
        int count = 0;
        for (int i=5; i<=n; i*=5){
            count = count + (n/i);
        }
        return count;
    }
}
