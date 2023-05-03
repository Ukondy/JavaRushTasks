package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            result += num;
        }
        System.out.println(result);
    }
}