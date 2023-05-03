package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int valStr = sc.nextInt();
        while(valStr > 0) {
            int rndNum = sc.nextInt();
            while(rndNum > 0) {
                multiArray = new int[valStr][rndNum];
                multiArray[valStr - 1][rndNum - 1] = 1;
                System.out.print(multiArray[valStr - 1][rndNum - 1]);
                rndNum--;
            }
            System.out.println();
            valStr--;
        }
    }
}
