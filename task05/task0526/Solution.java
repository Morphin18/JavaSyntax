package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Вася", 35,"Moscow");
        Man man2 = new Man("Вася", 35,"Moscow");
        Woman woman = new Woman("Мария", 20,"Moscow");
        Woman woman2 = new Woman("Мария", 20,"Moscow");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        String name, address;
        int age;
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man() {}
    }
    public static class Woman {
        String name, address;
        int age;
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Woman() {}
    }
}
