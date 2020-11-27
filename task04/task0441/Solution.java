package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int mid = 0;
        if (a >= c && b <=c || a <= c && b >= c)
        {
            mid = c;
        } else
            if (b >= a && c <= a || b <= a && c >= a)
            {
                mid = a;
            } else
                if (c >= b && a <= b || c <= b && a >= b)
                {
                    mid = b;
                }
        System.out.println(mid);
    }
}
