package com.AsymptoticNotation;
import java.util.Arrays;

//Ques4. Time Complexity of Reverse Array Function
public class Ques4 {
    public static void main(String[] args) {
        Ques4 rev = new Ques4();
        int[] arr1 = {1,2,3,4,5};

        rev.reverse(arr1);
    }

    void reverse(int[] array1){
       for (int i = array1.length-1; i>=0; i--){
            System.out.print(array1[i]+" ");
        }
       //or
        for (int i=0; i< array1.length/2; i++){
            int other = array1.length-i-1;
            int temp = array1[i];
            array1[i] = array1[other];
            array1[other] = temp;
        }
        System.out.println(Arrays.toString(array1));
    }
}

//Time complexity is O(N)