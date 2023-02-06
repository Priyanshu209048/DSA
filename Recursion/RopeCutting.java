package com.Recursion;

import java.util.Scanner;

public class RopeCutting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        System.out.println(cutRope(num1, num2, num3, num4));
    }

    static int cutRope(int n, int a, int b, int c){
        if (n == 0) return 0;
        if (n <= -1) return -1;

        int res = Math.max(cutRope(n-a, a, b, c),
                           Math.max(cutRope(n-b, a, b, c), cutRope(n-c, a, b, c)));

        if (res == -1)
            return -1;
        return res + 1;
    }
}
