package com.Recursion;

import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(myJos(num1, num2));
    }
    static int jos(int n, int k){
        if (n == 1)
            return 0;
        return (jos(n-1, k)+k) % n;
    }

    //If index is begin from 1 then we have to add this function
    static int myJos(int n, int k){
        return jos(n, k) + 1;
    }
}
