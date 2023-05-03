package com.javarush.task.pro.task05.task0507;

import java.util.Arrays;
import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int []arr = new int[n];
        while(n > 0) {
            n--;
            int sc2 = sc.nextInt();
            arr[i] = sc2;
            i++;
        }
        array = Arrays.copyOf(arr, arr.length);
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if(max < array[j]) {
                max = array[j];
            }
        }
        System.out.println(max);
    }
}
