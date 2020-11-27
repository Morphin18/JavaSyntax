package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int years = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();
        System.out.println("Меня зовут " + name+".");
        System.out.println("Я родился "+ date +"."+month+"."+years);
    }
}
