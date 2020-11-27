package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i] > array[j]) {
                    int temp_number = array[i];
                    array[i] = array[j];
                    array[j] = temp_number;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();

    }
}
