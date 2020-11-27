package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minimum = list.get(0).length();
        int maximum = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maximum) {
                maximum = list.get(i).length();
            }
            if (list.get(i).length() < minimum) {
                    minimum = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minimum) {
                System.out.println(list.get(i));
                break;
            }
            else
                if (list.get(i).length() == maximum) {
                    System.out.println(list.get(i));
                    break;
                }

        }
    }
}
