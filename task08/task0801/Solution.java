package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> meal = new HashSet<String>();
        meal.add("арбуз");
        meal.add("банан");
        meal.add("вишня");
        meal.add("груша");
        meal.add("дыня");
        meal.add("ежевика");
        meal.add("женьшень");
        meal.add("земляника");
        meal.add("ирис");
        meal.add("картофель");
        for (String text : meal) {
            System.out.println(text);
        }

    }
}
