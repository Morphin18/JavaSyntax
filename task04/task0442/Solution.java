package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while((number = scan.nextInt()) != -1) {
                sum += number;
        }
        sum += -1;
        System.out.println(sum);
    }
}
