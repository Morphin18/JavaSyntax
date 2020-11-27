package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);

    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> array = new ArrayList<int[]>();
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{1,2};
        int[] c = new int[]{1,2,3,4};
        int[] d = new int[]{1,2,3,4,5,6,7};
        int[] e = new int[]{};
        array.add(a);
        array.add(b);
        array.add(c);
        array.add(d);
        array.add(e);

       return array;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
