package com.javarush.task.task08.task0819;

import java.util.*;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.toArray()[0]);


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat kot : cats) {
            System.out.println(kot);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
        Cat(){

        }
    }

}
