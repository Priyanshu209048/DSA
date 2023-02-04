package com.AsymptoticNotation;

//Ques7. Time Complexity of Factorial
public class Ques7 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    }

    static int fact(int n){
        if (n<0){
            return -1;
        } else if (n==0) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
}

//Time complexity is O(N)