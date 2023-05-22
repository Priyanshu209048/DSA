package com.Sorting;

//Time Complexity - O(NLogN) and base is 10
//Auxiliary Space - O(N + 10)
public class RadixSort {

    public static void radixSort(int[] arr, int n){
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        for (int exp = 1; max/exp > 0 ; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    public static void countingSort(int[] arr, int n, int exp){
        int[] count = new int[10];
        int[] output = new int[n];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[(arr[i]/exp) % 10]++;     //Here count[(arr[i]/exp) % 10] means traversing digits of the number in every call of the function.
        }                                   //Like suppose there is 319 in first call of the function we check the 9 the in second call check 1 the in third call check 3.
        for (int i = 1; i < 10; i++) {
            count[i] = count[i-1] + count[i];
        }
        for (int i = n-1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {319, 212, 6, 8, 100, 50};
        int n = arr.length;
        radixSort(arr, n);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
