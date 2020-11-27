package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name, sex, nationality;
        private int age, weight, height;
        public Human() {}
        public Human(String name){
           Human.this.name = name;
        }
        public Human(String name, String sex){
            Human.this.name = name;
            Human.this.sex = sex;
        }
        public Human(String name, String sex, String nationality){
            Human.this.name = name;
            Human.this.sex = sex;
            Human.this.nationality = nationality;
        }
        public Human(String name, String sex, String nationality, int age){
            Human.this.name = name;
            Human.this.sex = sex;
            Human.this.nationality = nationality;
            Human.this.age = age;

        }
        public Human(String name, String sex, String nationality, int age, int weight){
            Human.this.name = name;
            Human.this.sex = sex;
            Human.this.nationality = nationality;
            Human.this.age = age;
            Human.this.weight = weight;
        }
        public Human(String name, String sex, String nationality, int age, int weight, int height){
            Human.this.name = name;
            Human.this.sex = sex;
            Human.this.nationality = nationality;
            Human.this.age = age;
            Human.this.weight = weight;
            Human.this.height = height;
        }
        public Human(String name, int age) {
            Human.this.name = name;
            Human.this.age = age;
        }
        public Human(String name, int weight, int height) {
            Human.this.name = name;
            Human.this.weight = weight;
            Human.this.height = height;
        }
        public Human(String name, String sex, int age) {
            Human.this.name = name;
            Human.this.sex = sex;
            Human.this.age = age;
        }
    }
}
