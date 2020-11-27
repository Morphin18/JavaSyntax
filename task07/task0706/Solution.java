package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int sum_even = 0, sum_odd = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if ((i % 2 == 0) || i == 0) {
                sum_even += array[i];
            }
            else
                sum_odd += array[i];
        }
       if (sum_even > sum_odd) {
           System.out.println("В домах с четными номерами проживает больше жителей.");
       }
       else
           System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
