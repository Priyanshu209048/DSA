package com.String;

public class AnagramSearch {
    static final int CHAR = 256;
    static boolean areAnagram(String txt, String pat, int i){
        int[] count = new int[CHAR];
        for (int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for (int j = 0; j < CHAR; j++) {
            if (count[j] != 0)
                return false;
        }

        return true;
    }

    static boolean isPresent(String txt, String pat){
        int n = txt.length();
        int m = pat.length();
        for (int i = 0; i < n-m; i++) {
            if (areAnagram(txt, pat, i))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String txt = "Priyanshu";
        String pat = "asn";
        if (isPresent(txt, pat))
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}
