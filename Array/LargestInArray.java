package com.Array;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 6, 30};
        System.out.println("Highest number in array at the index " + greatestElement(arr));

    }

//    static int greatestElement(int arr[]){
//        for (int i=0; i< arr.length; i++){
//            boolean flag = true;
//            for(int j=0; j< arr.length; j++){
//                if(arr[i] < arr[j]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                return i;
//            }
//        }
//        return -1;


    //Efficient Way
    static int greatestElement(int[] arr){
        int count = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[count]) {
                count = i;
            }
        }
        return count;
    }
}
