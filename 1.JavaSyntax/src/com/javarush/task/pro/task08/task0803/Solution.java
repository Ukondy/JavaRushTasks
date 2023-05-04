package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        Math.min(1,2);
        int min = ints[0];
        for (int i = 0; i < 10; i++) {
            if(min > ints[i]) {
                min = ints[i];
            }
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner sc = new Scanner(System.in);
        int []array = new int[10];
        for (int i = 0; i < 10; i++) {
            int sc1 = sc.nextInt();
            array[i] = sc1;
        }
        return array;
    }
}
