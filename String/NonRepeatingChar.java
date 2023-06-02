package com.String;
import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next ();
        int[] frequency = new int[256];

        for (int i = 0; i < str.length (); i++)
            frequency[str.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < 256; i++)
            if (frequency[i] == 1)
                count++;
        System.out.println(count);
    }
}