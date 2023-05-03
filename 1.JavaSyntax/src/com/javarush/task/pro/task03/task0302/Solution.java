package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        int sc2 = sc.nextInt();
        if(sc2 > 17 && sc2 < 29) {
            System.out.println(sc1 + militaryCommissar);
        }
    }
}
