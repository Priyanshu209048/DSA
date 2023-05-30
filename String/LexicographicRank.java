package com.String;

//Time Complexity - O(N*CHAR)
public class LexicographicRank {
    static final int CHAR = 256;
    static int fact(int n){
        if (n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }

    static int lexRank(String str){
        int res = 1;
        int n = str.length();
        int mul = fact(n);
        int[] count = new int[CHAR];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 1; i < CHAR; i++) {
            count[i] += count[i-1];
        }
        for (int i = 0; i < n-1; i++) {
            mul /= (n-i);
            res += count[str.charAt(i) - 1] * mul;
            for (int j = str.charAt(i); j < CHAR; j++) {
                count[i]--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "CBA";
        System.out.println(lexRank(str));
    }
}
