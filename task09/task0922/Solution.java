package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormatInput = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormatOutput = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = simpleDateFormatInput.parse(reader.readLine());
        System.out.println(simpleDateFormatOutput.format(date).toUpperCase());


    }
}
