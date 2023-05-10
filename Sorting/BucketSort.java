package com.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Time Complexity - Depends on which sorting we use it might be O(NLogN) or O(N^2)
public class BucketSort {

    public static void bucketSort(int[] arr, int n, int k){
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        max++;      //Here we do max++, otherwise this creates 1 extra bucket which starts with range from 81.

        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            bucket.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            int bi = (k * arr[i]) / 81;     //Simply we have divide the array according to their particular range in a bucket.
            bucket.get(bi).add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            Collections.sort(bucket.get(i));
        }

        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                arr[index++] = bucket.get(i).get(j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {30, 40, 10, 80, 5, 12, 70, 20};
        int n = arr.length;
        int k = 4;

        bucketSort(arr, n, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
