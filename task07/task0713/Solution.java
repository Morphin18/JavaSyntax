package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                a.add(list.get(i));
                b.add(list.get(i));
            }
            else
                if (list.get(i) % 3 == 0) {
                    a.add(list.get(i));
                }
                else
                    if (list.get(i) % 2 == 0) {
                        b.add(list.get(i));
                    }
                    else
                        c.add(list.get(i));
        }
        printList(a);
        printList(b);
        printList(c);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
