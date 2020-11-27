package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import javax.swing.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        while(true) {
            String exit = scan.next();
            if (exit.equals("сумма")) { break; }
            else {
                number = Integer.parseInt(exit);
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
