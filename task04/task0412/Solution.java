package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0) {
            number *= 2;
            System.out.println(number);
        } else
            if (number < 0){
            number += 1;
            System.out.println(number);
        } else {
            System.out.println(number);
        }
        }


}