package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        // 4 8
        // 4 8 5
        // 5 5 8
        // 4 8 2
        Scanner sc = new Scanner(System.in);
        int firstMin = sc.nextInt();
        int secondMin = sc.nextInt();
        if(firstMin > secondMin) {
            int temp = secondMin;
            secondMin = firstMin;
            firstMin = temp;
        }
        while(sc.hasNextInt()) {
            int number = sc.nextInt();
            if(number < secondMin && number > firstMin) {
                secondMin = number;
            } else if(number < firstMin) {
                secondMin = firstMin;
                firstMin = number;
            } else if(secondMin == firstMin && number > secondMin) {
                secondMin = number;
            }
        }
        System.out.println(secondMin);
    }
}