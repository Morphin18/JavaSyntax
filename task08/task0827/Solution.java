package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import sun.text.resources.FormatData;


import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("May 19 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentTime = new Date(date);
        Date newTime = new Date(date);
        newTime.setMonth(0);
        newTime.setDate(0);
        long msTime = currentTime.getTime() - newTime.getTime();
        if ((msTime /= 86400*1000) % 2 == 0) {
            return false;
        }
        return true;
    }
}
