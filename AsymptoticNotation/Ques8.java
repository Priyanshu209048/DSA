package com.AsymptoticNotation;


//Ques8. Time Complexity of Fibonacci
public class Ques8 {
    public static void main(String[] args) {
        int a = 10;
        for (int i=0; i<a; i++){
            System.out.println(fib(i));
        }
    }
    static int fib(int n){
        if (n<=0){
            return 0;
        } else if (n==1 || n==2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}

//Time complexity is O(2^N)