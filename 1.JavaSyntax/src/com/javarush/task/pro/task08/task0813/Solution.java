package com.javarush.task.pro.task08.task0813;

/* 
Степень двойки
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        int a = 2;
        int result = 2;
        int g = a << result;
        for(int i = 1; i < power; i++) {
            result *= 2;
        }
        return result;
    }
}
