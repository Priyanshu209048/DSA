package com.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        toh(n, 'A', 'B', 'C');
    }

    static void toh(int n, char A, char B, char C) {
        if (n == 0){
            return;
        }
        toh(n-1, A, C, B);
        System.out.println(A + "" + B);
        toh(n-1, C, B, A);
    }
}