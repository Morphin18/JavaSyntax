package com.javarush.task.task07.task0722;

import sun.security.mscapi.CPublicKey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String s = "";
        while (true) {
           s = reader.readLine();
           if (!s.equals("end")) {
               list.add(s);
           }
           else
               break;
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}