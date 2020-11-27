package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Ковальский", "Алексей");
        map.put("Иванов", "Михаил");
        map.put("Задронов", "Кирилл");
        map.put("Севальский", "Сергей");
        map.put("Тупаков", "Дмитрий");
        map.put("Владис", "Пельш");
        map.put("Степанов", "Анатолий");
        map.put("Петров", "Алексей");
        map.put("Балабанов", "Максим");
        map.put("Истиненко", "Роман");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator();
        ArrayList<String> name = new ArrayList<>();
        while (itr.hasNext()) {
         Map.Entry<String,String> pair = itr.next();
         name.add(pair.getValue());
        }
        for (int i = 0; i < name.size(); i++) {
            for (int j = i+1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))) {
                    removeItemFromMapByValue(map,name.get(j));
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map = createMap();
        removeTheFirstNameDuplicates(map);
    }
}
