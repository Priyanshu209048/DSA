package com.AsymptoticNotation;

//Ques5. Find Time Complexity for Given Method
public class Ques5 {
    public static void main(String[] args) {
        Ques5 pair = new Ques5();
        int[] arr = {1,5,8,7,9};
        int[] arr1 = {2,3,4,6,5};

        pair.printPair(arr,arr1);
    }

    void printPair(int[] arrayA, int[] arrayB){
        for (int i=0; i<arrayA.length; i++){
            for (int j=0; j<arrayB.length; j++){
                if (arrayA[i] < arrayB[j]) {
                    System.out.print(arrayA[i] + "" + arrayB[j]);
                    System.out.print(" ");
                }
            }
        }
    }
}

//Time Complexity is O(AB) or O(^2)