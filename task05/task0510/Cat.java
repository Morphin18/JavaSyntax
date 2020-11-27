package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public String name = null;
    public int weight;
    public int age;
    public String color;
    public String address = null;

    public void initialize(String name) {
        this.name = name;
        this.weight = 15;
        this.age = 5;
        this.color = "Grey";
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Blue";
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "Green";

    }
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 10;

    }
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 4;
    }
    public static void main(String[] args) {

    }
}
