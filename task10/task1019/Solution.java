package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String name = "";
        int id = 0;
        while (true) {
            try
            {
                id = Integer.parseInt(reader.readLine());
            }catch (NumberFormatException e)
            {
                for (Map.Entry<String,Integer> pair : map.entrySet()) {
                    System.out.println(pair.getValue() + " " + pair.getKey());
                }
                break;
            }
            name = reader.readLine();
            if (name.isEmpty()) {
                map.put("",id);
                for (Map.Entry<String,Integer> pair : map.entrySet()) {
                    System.out.println(pair.getValue() + " " + pair.getKey());
                }
                break;
            }
            map.put(name, id);
        }

    }
}
