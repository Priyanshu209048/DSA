package com.String;

import java.util.Arrays;

public class CheckAnagram {

    /*public static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        s1 = new String(arr1);

        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        s2 = new String(arr2);

        return s1.equals(s2);
    }*/

    //Efficient Way
    static final int CHAR = 256;
    public static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length())
            return false;
        int[] count = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(anagram(str1, str2));
    }
}
