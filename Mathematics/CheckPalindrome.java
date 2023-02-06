package com.Mathematics;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
        System.out.println(ispalindrome(digit));
    }

    static boolean ispalindrome(int n){
        int reverse = 0;
        int remainder = 0;
        int num = n;  // Here we store the number into another variable because in every loop we remove the last digit, and we also need the original number at the end for comparison
        while (num != 0){
            remainder = num % 10;
            reverse = reverse*10 + remainder;
            num /= 10;
        }
        return reverse == n;
    }
}
