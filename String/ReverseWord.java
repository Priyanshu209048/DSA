package com.String;

public class ReverseWord {

    public static void reverseWord(char[] str, int n){
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == ' '){
                reverse(str, start, i-1);
                start = i+1;
            }
        }
        reverse(str, start, n-1);
        reverse(str, 0, n-1);
    }

    public static void reverse(char[] str, int low, int high){
        while (low <= high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            low++; high--;
        }
    }

    public static void main(String[] args) {
        String str = "Hello My name is Priyanshu";
        char[] ch = str.toCharArray();
        int n = str.length();
        reverseWord(ch, n);
        System.out.println(ch);
    }
}
