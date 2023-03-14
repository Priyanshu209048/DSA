package com.Array;

import java.util.Scanner;

class Delete{
    int[] arr = new int[5];

    public void checkInsert(int position, int key){
        try{
            if(arr[position] == 0){
                System.out.println("Element inserted");
                arr[position] = key;
            } else{
                System.out.println("Array is full");
            }
        } catch (Exception e){
            System.out.println("Index is out of bound...");
        }
    }

    public void delete(int value){
        for (int i=0; i< arr.length; i++){
            try{
                if (arr[i] == value){
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("Element deleted...");
                }
            } catch (Exception e){
                System.out.println("Element is not presented");
            }
        }
    }

    public void print(int size){
        try{
            for (int i=0; i<size; i++){
                System.out.print(arr[i] + " ");
            }
        } catch(Exception e){
            System.out.println("Array is no longer exits...");
        }
    }
}

public class DeletionAtAnyPosition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Delete de = new Delete();

        for (int i=0; i<5; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            de.checkInsert(a, b);
        }
        System.out.println("Element before deletion...");
        de.print(5);

        int delValue = 4;
        de.delete(delValue);
        System.out.println("Element after deletion...");
        de.print(5);
    }
}
