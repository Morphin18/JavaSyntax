package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        double sum = 0;
        int count = 0;
        while ((number = scan.nextInt()) != -1) {
            sum += number;
            count++;
        }
        System.out.println(sum/count);
    }
}

