package com.AsymptoticNotation;

//Ques5. Find Time Complexity for Given Method
public class Ques6 {
    public static void main(String[] args) {
        Ques6 pair = new Ques6();
        int[] arr = {1,5,8,7,9};
        int[] arr1 = {2,3,4,6,5};

        pair.printPair(arr,arr1);
    }

    void printPair(int[] arrayA, int[] arrayB){
        for (int i=0; i<arrayA.length; i++){
            for (int j=0; j<arrayB.length; j++){
                for (int k=0; k<=100000; k++){       // O(1)
                    System.out.print(arrayA[i] + "" + arrayB[j]);
                    System.out.print(" ");
                }
            }
        }
    }
}

//Time Complexity is O(AB) or O(^2)