package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        char[] ch = word.toCharArray();
        List<Character> con = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            if(isVowel(ch[i])) {
                System.out.print(ch[i] + " ");
            }
            else
                if (ch[i] != ' ') {
                    con.add(ch[i]);
                }




        }
        System.out.println();
        for (int i = 0; i < con.size(); i++) {
            System.out.print(con.get(i) + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}