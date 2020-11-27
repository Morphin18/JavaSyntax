package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        int[] b = new int[10];
        int[] c = new int[10];
        int j = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
            if (i < 10) {
                b[j] = a[i];
                j++;
            } else
                if (i >= 10) {
                c[k] = a[i];
                k++;
            }
        }
        for (int value : c) {
            System.out.println(value);
        }
    }
}
