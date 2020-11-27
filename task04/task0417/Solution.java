package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b && a == c) {
            System.out.println(a+" "+b+" "+c);
        } else
        if (a == b || a == c) {
            if (a == b) {
                System.out.println(a+" "+b);
            }
            else
                System.out.println(a+" "+c);
        } else
            if (b == a || b == c) {
                if (b == a) {
                    System.out.println(b+" "+a);
                } else
                    System.out.println(b+" "+c);
            } else
                if (c == a || c == b){
                    if (c == a) {
                        System.out.println(c+" "+a);
                    } else
                        System.out.println(c+" "+b);
                }

    }
}