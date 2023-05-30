package com.String;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {

    //Time Complexity - O(N^2)
    /*public static int leftMost(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }*/

    //Better Way
    //Time Complexity - O(N)
    static final int CHAR = 256;
    /*public static int leftMost(String str){
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1)
                return i;
        }
        return -1;
    }*/

    //Efficient Way 1
    /*public static int leftMost(String str){
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (fIndex[str.charAt(i)] == -1)
                fIndex[str.charAt(i)] = i;
            else
                res = Math.min(res, fIndex[str.charAt(i)]);
        }
        return res;
    }*/

    //Efficient Way 2
    public static int leftMost(String str){
        boolean[] visited = new boolean[CHAR];
        Arrays.fill(visited, true);
        int res = -1;
        for (int i = str.length()-1; i >= 0; i--) {
            if (!visited[str.charAt(i)])
                res = i;
            else
                visited[str.charAt(i)] = false;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "Baral";
        System.out.println(leftMost(str));
    }
}
