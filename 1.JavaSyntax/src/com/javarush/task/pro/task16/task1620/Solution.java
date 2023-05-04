package com.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/* 
Еще один простой шаблон
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String format = formatter.format(zonedDateTime);
        System.out.println(format);
    }
}
