package com.Sorting;

import java.util.Arrays;

class Interval implements Comparable<Interval>{

    int s, e;

    public Interval(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Interval o) {
        return this.s - o.s;
    }
}

public class MergeOverlappingIntervals {

    //Time Complexity - O(NLogN)
    public static void merge(Interval[] arr, int n){
        Arrays.sort(arr);
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[res].e >= arr[i].s){
                arr[res].e = Math.max(arr[res].e, arr[i].e);
                arr[res].s = Math.min(arr[res].s, arr[i].s);
            }
            else {
                res++;
                arr[res] = arr[i];
            }
        }
        for (int i = 0; i <= res; i++) {
            System.out.println(arr[i].s + " " + arr[i].e);
        }
    }

    public static void main(String[] args) {
        Interval[] arr = {new Interval(5, 10), new Interval(3, 15), new Interval(18, 30), new Interval(2, 7)};
        int n = arr.length;
        merge(arr, n);
    }
}
