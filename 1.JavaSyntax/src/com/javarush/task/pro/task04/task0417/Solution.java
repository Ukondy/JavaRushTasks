package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        double speed = 3.6;
        double duo = speed * sc1;
        System.out.println(Math.round(duo));
    }
}