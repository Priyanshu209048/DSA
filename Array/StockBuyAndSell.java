package com.Array;

public class StockBuyAndSell {

//    static int maxProfit(int[] arr, int low , int high){
//        if (low >= high)
//            return 0;
//        int profit = 0;
//        for (int i = low; i < high; i++){
//            for (int j = i+1; j <= high; j++){
//                if (arr[j] > arr[i]){
//                    int currProfit = arr[j] - arr[i] + maxProfit(arr, j+1, high) + maxProfit(arr, low, i-1);
//                    profit = Math.max(profit, currProfit);
//                }
//            }
//        }
//        return profit;
//    }

    //Efficient Way
    static int maxProfit(int[] arr, int low, int high){
        int profit = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        int low = 0, high = arr.length-1;
        int profit = maxProfit(arr, low, high);
        System.out.println(profit);
    }
}
