package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date();

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        System.out.println();
        String day = String.valueOf(date.getDay());
        if(day.equals("0")) {
            day = "Воскресенье";
        } else if(day.equals("1")) {
            day = "Понедельник";
        } else if(day.equals("2")) {
            day ="Вторник";
        } else if(day.equals("3")) {
            day = "Среда";
        } else if(day.equals("4")) {
            day = "Четверг";
        } else if(day.equals("5")) {
            day = "Пятница";
        } else if(day.equals("6")) {
            day = "Суббота";
        }
        return day;
    }
}
