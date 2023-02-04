package com.AsymptoticNotation;

//Ques2. Time Complexity of Print Pairs Method
public class Ques2 {
    public static void main(String[] args) {
        Ques2 pair = new Ques2();
        int[] arr = {1,5,8,7,9};

        pair.printPair(arr);
    }

    void printPair(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print("[ ");
            for (int j=0; j<array.length; j++){
                System.out.print(array[i] +""+ array[j]);
                System.out.print(" ");
            }
            System.out.println("]");
        }
    }
}

//Time Complexity is O(N^2).