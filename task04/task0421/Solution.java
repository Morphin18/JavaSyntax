package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name_one = scan.next();
        String name_two = scan.next();
        if (name_one.equals(name_two)) System.out.println("Имена идентичны");
        else
            if (name_one.length() == name_two.length()) System.out.println("Длины имен равны");

    }
}
