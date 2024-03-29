package com.String;

public class RabinKarpAlgo {

    static final int d = 256;
    static final int q = 101;
    public static void RBSearch(String pat, String txt, int M, int N){
        int h = 1;
        for (int i = 1; i <= M-1; i++) {
            h = (h * d) % q;
        }

        int p = 0, t = 0;
        for (int i = 0; i < M; i++) {
            p = (p*d + pat.charAt(i)) % q;
            t = (t*d + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= (N-M); i++) {
            if (p == t){
                boolean flag = true;
                for (int j = 0; j < M; j++) {
                    if (txt.charAt(i+j) != pat.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.print(i + " ");
            }

            if (i < N-M){
                t = ((d * (t - txt.charAt(i) * h)) + txt.charAt(i + M)) % q;
                if (t < 0) t += q;
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "ABCABCD";
        String str2 = "ABC";
        RBSearch(str2, str1, str2.length(), str1.length());
    }
}
