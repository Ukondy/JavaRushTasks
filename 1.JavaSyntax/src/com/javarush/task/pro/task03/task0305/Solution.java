package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        if(firstNum == secondNum && secondNum == thirdNum) {
            System.out.println(firstNum + " " + secondNum + " " + thirdNum);
        } else if(firstNum == secondNum) {
            System.out.println(firstNum + " " + secondNum );
        } else if(secondNum == thirdNum) {
            System.out.println(secondNum + " " + thirdNum);
        } else if(firstNum == thirdNum) {
            System.out.println(firstNum + " " + thirdNum);
        }
    }
}
