package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
           array[i] = scan.nextInt();
           if (array[i] > 0 && array[i] != 0) count++;
        }
        System.out.println(count);
    }
}
