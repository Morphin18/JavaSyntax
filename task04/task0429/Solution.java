package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
            if (array[i] != 0) {
                if (array[i] < 0) negative++;
                else positive++;
            }
        }
        System.out.println("количество отрицательных чисел: "+negative);
        System.out.println("количество положительных чисел: "+positive);
    }
}
