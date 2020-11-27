package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
       ArrayList<String>[] list = new ArrayList[5];
       list[0] = new ArrayList<>();
       list[1] = new ArrayList<>();
       list[2] = new ArrayList<>();
       list[3] = new ArrayList<>();
       list[4] = new ArrayList<>();
        Collections.addAll(list[0], "Вася");
        Collections.addAll(list[1], "Вася");
        Collections.addAll(list[2], "Вася");
        Collections.addAll(list[3], "Вася");
        Collections.addAll(list[4], "Вася");


        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}