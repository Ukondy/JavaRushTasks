package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простой шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                localDateTime.getDayOfMonth() + "." +
                localDateTime.getMonthValue() + "." +
                localDateTime.getYear() + "г. " +
                localDateTime.getHour() + "ч." +
                localDateTime.getMinute() + "мин");
        System.out.println(localDateTime.format(formatter));
    }
}
