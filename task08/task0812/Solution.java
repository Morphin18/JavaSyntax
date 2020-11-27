package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int maximum = 1;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                count++;
                if (count > maximum) { maximum = count;}
            }
            else
                count = 1;
        }
        System.out.println(maximum);
    }
}