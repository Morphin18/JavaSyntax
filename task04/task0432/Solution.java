package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n  = scan.nextInt();
        while (!(n == 0 || n < 0))
        {
            System.out.println(str);
            n--;
        }

    }
}
