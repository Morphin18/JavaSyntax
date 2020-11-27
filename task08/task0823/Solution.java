package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        string = string.trim().replaceAll(" +", " ");
        String[] str = string.split(" ");

        for (int i = 0; i < str.length; i++) {
            int len = str[i].length();
            String s = str[i].substring(0,1).toUpperCase() + str[i].substring(1, len);
            System.out.print(s + " ");
        }

    }
}
