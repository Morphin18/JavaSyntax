package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array_string = new String[10];
        int[] array_number = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array_string.length; i++) {
            array_string[i] = reader.readLine();
            array_number[i] = array_string[i].length();
        }
        for (int value : array_number) {
            System.out.println(value);
        }
    }
}
