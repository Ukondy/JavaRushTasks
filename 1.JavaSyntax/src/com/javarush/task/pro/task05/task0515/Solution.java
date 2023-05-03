package com.javarush.task.pro.task05.task0515;

import java.util.Arrays;

/* 
Сравнение двумерных массивов
*/

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        if(arrayFirst.length == arraySecond.length) {
            for (int i = 0; i < arrayFirst.length; i++) {
                for (int j = 0; j < arrayFirst[i].length; j++) {
                    if(arrayFirst[i][j] != arraySecond[i][j]) {
                        System.out.println("false");
                        break;
                    }
                }
            }
            System.out.println("true");
        }
    }
}
