package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("Ковальский", "Алексей");
        map.put("Иванов", "Михаил");
        map.put("Задронов", "Кирилл");
        map.put("Севальский", "Сергей");
        map.put("Тупаков", "Дмитрий");
        map.put("Владис", "Пельш");
        map.put("Степанов", "Кирилл");
        map.put("Петров", "Алексей");
        map.put("Балабанов", "Дмитрий");
        map.put("Истиненко", "Сергей");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet()) {
            if (name.equals(pair.getValue())) {
             count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet()) {
            if (lastName.equals(pair.getKey())) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
