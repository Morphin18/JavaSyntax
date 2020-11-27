package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Джонс", dateFormat.parse("MAY 1 2012"));
        map.put("Бритни", dateFormat.parse("MAY 1 2012"));
        map.put("Джесика", dateFormat.parse("MAY 1 2012"));
        map.put("Арнольд", dateFormat.parse("June 1 2012"));
        map.put("Джек", dateFormat.parse("MAY 1 2012"));
        map.put("Джон", dateFormat.parse("June 1 2012"));
        map.put("Том", dateFormat.parse("MAY 1 2012"));
        map.put("Томми", dateFormat.parse("June 1 2012"));
        map.put("Джонсон", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String,Date>> itr = map.entrySet().iterator();
        int value = 0;
        while(itr.hasNext()) {
            Map.Entry<String, Date> pair = itr.next();
            value = pair.getValue().getMonth();
            if (value >= 5 && value <= 7) {
                itr.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {


    }
}
