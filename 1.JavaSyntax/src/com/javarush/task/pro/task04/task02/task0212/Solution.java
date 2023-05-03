package com.javarush.task.pro.task04.task02.task0212;

/* 
Попрошу регистр на меня не повышать!
*/

import java.util.Locale;

public class Solution {

    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        //напишите тут ваш код
        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
