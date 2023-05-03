package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int maxInt = 2147483647;
        while(sc.hasNextInt()) {
            int sc2 = sc.nextInt();
            if(maxInt >= sc2) {
                maxInt = sc2;
            }
        }
        System.out.println(maxInt);
    }
}