package com.String;

public class LongestDistinctSubstring {

    static boolean areDistinct(String str, int i, int j){
        boolean[] visited = new boolean[256];
        for (int k = i; k < j; k++) {
            if (visited[str.charAt(k)])
                return false;
            visited[str.charAt(k)] = true;
        }
        return true;
    }

    static int longestDistinct(String str){
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abac";
        int len = longestDistinct(str);
        System.out.println(len);
    }
}
