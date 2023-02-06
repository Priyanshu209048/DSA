package com.BitMagic;

public class TwoOddOccurring {
    public static void main(String[] args) {
        int[] A = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        int size = A.length;
        findOdd(A,size);
    }

    static void findOdd(int[] arr, int n){
//        for (int i=0; i<n; i++){
//            int count = 0;
//            for (int j=0; j<n;j++) {
//                if (arr[i] == arr[j])
//                    count++;
//            }
//            if (count%2 != 0)
//                System.out.println(arr[i]);
//        }

        //Efficient Way
        int x = 0, res1 = 0, res2 = 0;
        for (int i=0; i<n; i++)
            x = x ^ arr[i];

        int sn = (x & (~(x - 1)));

        for (int i=0; i<n; i++){
            if ((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1 + " " + res2);
    }
}
