package com.String;

public class PalindromeCheck {

    /*public static boolean isPalindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }*/

    //Efficient Way
    /*public static boolean isPalindrome(String str){
        boolean flag = true;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == str.charAt(str.length()-1-i))
                flag = true;
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }*/
    //OR
    public static boolean isPalindrome(String str){
        int begin = 0;
        int end = str.length()-1;
        while (begin < end){
            if (str.charAt(begin) != str.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "ABCDCBA";
        System.out.println(isPalindrome(str));
    }
}
