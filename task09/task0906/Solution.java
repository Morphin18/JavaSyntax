package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {

        log("In main method");
    }

    public static void log(String s) {
        //напишите тут
        String stackNameClass = Thread.currentThread().getStackTrace()[2].getClassName();
        String stackNameMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(stackNameClass + ": " + stackNameMethod + ": " + s);
    }
}
