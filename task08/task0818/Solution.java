package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ковальский", 1000);
        map.put("Строгов", 600);
        map.put("Инщенко", 400);
        map.put("Достоевский", 1000);
        map.put("Путин", 1000);
        map.put("Чехов", 300);
        map.put("Пушкин", 700);
        map.put("Капустина", 1000);
        map.put("Егубинко", 550);
        map.put("Заботина", 1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}