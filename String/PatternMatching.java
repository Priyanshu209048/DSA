package com.String;

public class PatternMatching {

    /*public static void patSearch(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        for (int i = 0; i <= (m-n); i++) {
            int j;
            for (j = 0; j < n; j++) {
                if(str2.charAt(j) != str1.charAt(i+j))
                    break;
            }
            if (j == n)
                System.out.print(i + " ");
        }
    }*/

    //Improved Way
    public static void patSearch(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        for (int i = 0; i <= (m-n); i++) {
            int j;
            for (j = 0; j < n; j++) {
                if(str2.charAt(j) != str1.charAt(i+j))
                    break;
            }
            if (j == n)
                System.out.print(i + " ");
            else if (j == 0)
                i++;
            else
                i += j;
        }
    }

    public static void main(String[] args) {
        String str1 = "ABCABCD";
        String str2 = "ABC";
        patSearch(str1, str2);
    }
}
