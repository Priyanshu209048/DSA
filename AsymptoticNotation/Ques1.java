package com.AsymptoticNotation;

//Ques1. Time Complexity of Method that returns Sum and Product of Array.
public class Ques1 {
    public static void main(String[] args) {
        Ques1 sp = new Ques1();
        int[] arr = {1,5,8,7,9};
        sp.sumProduct(arr);
    }

    void sumProduct(int[] sparray){
        int sum = 0;
        int product = 1;
        for (int i=0; i<sparray.length; i++){
            sum += sparray[i];
        }
        for (int i=0; i<sparray.length; i++) {
            product *= sparray[i];
        }
        System.out.println(sum+"\n"+product);
    }
}

//Time complexity is O(N).