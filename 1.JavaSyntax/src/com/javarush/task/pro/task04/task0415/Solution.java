package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double sc1 = sc.nextInt();
        double pi = 3.14;
        double l = 0;
        l = pi * (sc1 * sc1);
        double s = Math.floor(l);
        System.out.println(Math.round(s));
    }
}