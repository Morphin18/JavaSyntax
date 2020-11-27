package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < 10; i++) {
                numbers.add(Integer.parseInt(reader.readLine()));
            }
        }catch (NumberFormatException e)
        {
            for (Integer num : numbers) {
                System.out.println(num);
            }
        }catch (IOException e)
        {
            e.getStackTrace();
        }
    }
}
