package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String,Cat> map = new HashMap<String, Cat>();
        map.put("Барсик", new Cat("Барсик"));
        map.put("Кнопка", new Cat("Кнопка"));
        map.put("Мифодий", new Cat("Мифодий"));
        map.put("Пушок", new Cat("Пушок"));
        map.put("Тапок", new Cat("Тапок"));
        map.put("Вася", new Cat("Вася"));
        map.put("Рыжик", new Cat("Рыжик"));
        map.put("Тима", new Cat("Тима"));
        map.put("Том", new Cat("Том"));
        map.put("Джери", new Cat("Джери"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
