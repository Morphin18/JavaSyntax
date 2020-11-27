package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] string = s.toCharArray();
        int count = 0;
        while (count != 40)
        {
            for (int i = count; i < string.length; i++) {
                System.out.print(string[i]);
            }
            System.out.println();
            count++;
        }
        //напишите тут ваш код

    }

}

