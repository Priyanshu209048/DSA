package com.Recursion;

import java.util.Scanner;

public class GenerateSubset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        subset(s, "", 0);
    }

    static void subset(String str, String curr, int i){
        if (i == str.length()){
            System.out.println("\""+curr+"\"");
            return;
        }

        subset(str, curr, i+1);
        subset(str, curr+str.charAt(i), i+1);
    }
}
