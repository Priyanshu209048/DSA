package com.Array;

public class SecondLargestElement {
//    static int greatestElement(int[] arr){
//        int count = 0;
//        for (int i=1; i<arr.length; i++) {
//            if (arr[i] > arr[count]) {
//                count = i;
//            }
//        }
//        return count;       //It returns the index
//    }
//
//    static int secondLargest(int[] arr){
//        int largest = greatestElement(arr);
//        int res  = -1;
//        for (int i=0; i<arr.length; i++){
//            if(arr[i] != arr[largest]){
//                if(res == -1)
//                    res = i;
//                else if(arr[i] > arr[res])
//                    res = i;
//            }
//        }
//        return res;
//    }

    //Efficient Method
    static int secondLargest(int[] arr){
        int res = -1, largest = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > arr[largest]){
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]){
                if (res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 5, 20, 20, 6};
        System.out.println("Highest number in array at the index " + secondLargest(arr));
    }
}
