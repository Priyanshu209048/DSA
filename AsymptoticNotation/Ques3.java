package com.AsymptoticNotation;

//Ques2. Time Complexity of Print Pairs Method
public class Ques3 {
    public static void main(String[] args) {
        Ques3 pair1 = new Ques3();
        int[] arr1 = {1,5,8,7,9};

        pair1.printPair(arr1);
    }

    void printPair(int[] array1){
        for (int i=0; i<array1.length; i++){
            for (int j=i+1; j<array1.length; j++){
                System.out.print(array1[i] +""+ array1[j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

//Time Complexity is O(N^2).