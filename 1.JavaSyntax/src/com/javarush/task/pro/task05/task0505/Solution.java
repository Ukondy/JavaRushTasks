package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        int []arr = new int[sc1];
        int s = 0;
        if (sc1 > 0) {
            if(!(sc1 % 2 == 0)) {
                while (sc1 > 0) { //reverse
                    int sc2 = sc.nextInt();
                    arr[s] = sc2;
                    s++;
                    sc1--;
                }
            } else {
                while (sc1 > 0) { // without reverse
                    int sc2 = sc.nextInt();
                    sc1--;
                    arr[sc1] = sc2;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
