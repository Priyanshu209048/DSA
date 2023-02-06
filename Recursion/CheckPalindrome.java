package com.Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(CheckPal(s, 0, s.length()-1));
    }

    static boolean CheckPal(String str, int start, int end){
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end) && CheckPal(str, start+1, end-1));
    }
}