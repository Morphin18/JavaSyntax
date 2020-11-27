package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int minimum = 0;
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        minimum = list.get(0).length();
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() < minimum) {
                minimum = list.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == minimum) {
                System.out.println(list.get(i));
            }
        }
    }
}
