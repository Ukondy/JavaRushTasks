package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int maxInt = -2147483648;
        while(sc.hasNextInt()) {
            int sc2 = sc.nextInt();
            if(sc2 % 2 == 0) {
                if (maxInt <= sc2) {
                    maxInt = sc2;
                }
            }
        }
        System.out.println(maxInt);
    }
}