package com.AsymptoticNotation;


//Ques9. Time Complexity Powers Of 2
public class Ques9 {
    public static void main(String[] args) {
        int a = 25;
        System.out.println(power2(a));
    }

    static int power2(int n){
        if (n<0){
            return 0;
        } else if (n==0 || n==1) {
            return 1;
        } else {
            int prev = power2(n/2);
            int curr = prev*2;
            return curr;
        }
    }
}

//Time complexity is O(logN)