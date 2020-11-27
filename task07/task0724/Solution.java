package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human_one = new Human("Аня", false, 90);
        Human human_two = new Human("Таня", false, 85);
        Human human_three = new Human("Дима", true, 65);
        Human human_four = new Human("Коля", true, 70);
        Human human_five = new Human("Оля", false, 35, human_three, human_two);
        Human human_six = new Human("Сергей", true, 34, human_four, human_one);
        Human human_seven = new Human("Тоня", false, 20, human_six, human_five);
        Human human_eight = new Human("Игорь", true, 15, human_six, human_five);
        Human human_nine = new Human("Кристина", false, 10, human_six, human_five);
        System.out.println(human_one);
        System.out.println(human_two);
        System.out.println(human_three);
        System.out.println(human_four);
        System.out.println(human_five);
        System.out.println(human_six);
        System.out.println(human_seven);
        System.out.println(human_eight);
        System.out.println(human_nine);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }
}