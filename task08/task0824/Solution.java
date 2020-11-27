package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human son_one = new Human("Дима", true, 5);
        Human son_two = new Human("Игорь", true, 15);
        Human son_three = new Human("Максим", true, 20);
        Human father = new Human("Михаил", true, 30,son_one, son_two,son_three);
        Human mother = new Human("Аня", false, 25, son_one, son_two,son_three);
        Human grandFather = new Human("Сергей", true, 80, father);
        Human grandMother = new Human("Евгения", false, 75,father);
        Human grandFather_second = new Human("Дмитрий", true, 85,mother);
        Human grandMother_second = new Human("Мария", false, 70,mother);
        System.out.println(grandMother_second);
        System.out.println(grandFather_second);
        System.out.println(grandMother);
        System.out.println(grandFather);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(son_one);
        System.out.println(son_two);
        System.out.println(son_three);



    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
        public Human(String name, boolean sex, int age, Human children, Human children_two, Human children_three) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(children);
            this.children.add(children_two);
            this.children.add(children_three);
        }
        public Human(String name, boolean sex, int age, Human children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(children);
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


    }
}
