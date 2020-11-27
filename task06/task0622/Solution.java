package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int temp_number = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp_number;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
