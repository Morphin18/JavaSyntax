package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.IOException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends SocketException {
    }

    static class MyException3 extends RuntimeException{
        String name;
        public void MyException3(String...name) {
            for (String s : name) {
                this.name = s;
            }
        }

    }

    static class MyException4 extends ArithmeticException{
    }

}

