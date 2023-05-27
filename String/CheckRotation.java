package com.String;

public class CheckRotation {

    public static boolean rotation(String str1, String str2){
        if (str1.length() != str2.length())
            return false;
        String temp = str1 + str1;
        /*return temp.indexOf(str2) != -1;*/
        return temp.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        System.out.println(rotation(str1, str2));
    }
}
