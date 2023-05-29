package com.String;

import java.util.Arrays;

public class LeftmostNotRepeating {

    /*public static int leftMostNot(String str){
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return i;
        }
        return -1;
    }*/

    //Better Way
    //Time Complexity - O(N)
    static final int CHAR = 256;
    /*public static int leftMostNot(String str){
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }*/

    //Time Complexity - O(N)
    public static int leftMostNot(String str){
        int[] fi = new int[CHAR];
        Arrays.fill(fi, -1);
        for (int i = 0; i < str.length(); i++) {
            if (fi[str.charAt(i)] == -1)
                fi[str.charAt(i)] = i;
            else
                fi[str.charAt(i)] = -2;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < CHAR; i++) {
            if (fi[i] >= 0)
                res = Math.min(fi[i], res);
        }
        return (res == Integer.MAX_VALUE)? -1 : res;
    }

    public static void main(String[] args) {
        String str = "Baral";
        System.out.println(leftMostNot(str));
    }
}
