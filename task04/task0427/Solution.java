package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number <= 999 && number >= 1) {
            if ((number % 2 == 0) && number < 10) {
                System.out.println("четное однозначное число");
            } else
                if ((number % 2 != 0) && number < 10) {
                    System.out.println("нечетное однозначное число");
                } else
                    if ((number % 2 == 0) && (number >= 10 && number < 100)) {
                System.out.println("четное двузначное число");
            } else
                if ((number % 2 != 0) && (number >= 10 && number < 100)) {
                    System.out.println("нечетное двузначное число");
                } else
                    if ((number % 2 == 0) && (number >= 100 && number <= 999)) {
                        System.out.println("четное трехзначное число");
                    } else
                        if ((number % 2 != 0) && (number >= 100 && number <= 999)) {
                            System.out.println("нечетное трехзначное число");
                        }
        }

    }
}
