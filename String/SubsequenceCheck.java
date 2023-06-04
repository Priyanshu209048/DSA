package com.String;

public class SubsequenceCheck {

    //Iterative Method
    public static boolean subsequenceCheck(String str1, String str2){
        int j = 0;
        if (str1.length() < str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(j)){
                j++;
            }
        }
        return j == str2.length();
    }

    //Recursive Method
    public static boolean subsequenceCheck1(String str1, String str2, int n, int m){
        if (n == 0)
            return false;
        if (m == 0)
            return true;
        if (str1.charAt(n-1) == str2.charAt(m-1))
            return subsequenceCheck1(str1, str2, n-1, m-1);
        else
            return subsequenceCheck1(str1, str2, n-1, m);
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "AD";
        System.out.println(subsequenceCheck(str1, str2));   //True

        String str3 = "ABCDE";
        String str4 = "AED";
        System.out.println(subsequenceCheck1(str3, str4, str1.length(), str2.length()));   //False
    }
}
