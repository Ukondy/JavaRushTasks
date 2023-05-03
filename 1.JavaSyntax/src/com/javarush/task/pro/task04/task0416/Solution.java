package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double sc1 = sc.nextDouble();
        double sc2 = sc.nextDouble();
        double s = sc1 / sc2;
        if(s % 2 == 0) {
            Math.floor(s);
            System.out.println(Math.round(s));
        } else {
            System.out.println(s);
        }
    }
}