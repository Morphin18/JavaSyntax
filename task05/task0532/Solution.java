package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int num = 0, number = Integer.parseInt(reader.readLine());
       if (number > 0) {
           for (int i = 0; i < number; i++) {
               num = Integer.parseInt(reader.readLine());
               if (num > maximum) { maximum = num; }
           }
           System.out.println(maximum);
        }



    }
}
