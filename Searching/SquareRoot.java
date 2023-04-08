package com.Searching;

public class SquareRoot {

    /*public static int sqRootFloor(int n){
        int i = 1;
        while (i*i <= n)
            i++;
        return i-1;
    }*/

    //Efficient Way
    public static int sqRootFloor(int n){
        int low = 1, high = n, ans = -1;
        while (low <= high){
            int mid = (low + high) / 2;
            int mSq = mid * mid;
            if (mSq == n)
                return mid;
            else if (mSq > n)
                high = mid - 1;
            else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 24;
        System.out.println(sqRootFloor(num));
    }
}
